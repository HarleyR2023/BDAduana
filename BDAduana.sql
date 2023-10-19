use master;

go;

if exists (select * from sysdatabases where name = 'BDAduana')
	drop database BDAduana;
go;

create database BDAduana;

use BDAduana;

-- Tablas de Cliente

create table ClienteNacional(
	RUC int not null,
	Consignatorio varchar(250) not null,
	Propietario varchar(250) not null,
	Contacto varchar(20),

	primary key (RUC)
);

create table ClienteExtranjero(
	CodigoExtranjero int not null,
	Consignatorio varchar(250) not null,
	Propietario varchar(250) not null,
	Contacto varchar(20),
	Pais varchar(20),

	primary key (CodigoExtranjero)
);

create table Cliente(
	CodigoRUC int not null,
	RUC int,
	CodigoExtranjero int,
	Estado varchar(50),

	primary key (CodigoRUC),
	foreign key (RUC) references ClienteNacional(RUC),
	foreign key (CodigoExtranjero) references ClienteExtranjero(CodigoExtranjero)
);

-- Tablas de Usuarios

create table Empleado(
	EmpleadoID int identity not null,
	Usuario varchar(100),
	Correo varchar(50),
	DNI varchar(8),
	Contraseña varchar(50),

	primary key (EmpleadoID)
);

create table Administrador(
	AdminID int not null,
	Usuario varchar(100),
	Correo varchar(50),
	DNI varchar(8),
	Contraseña varchar(50),

	primary key (AdminID)
);

-- Tablas de Control

create table DetalleEmpleado(
	EmpleadoID int,
	Departamento varchar(50),
	Direccion varchar(100),
	Salario decimal(10, 8),
	Cargo varchar(20),
	DNI int,
	Estado varchar(20),
	CodigoMaestro int,

	foreign key (EmpleadoID) references Empleado(EmpleadoID)
);

create table ReporteEmpleado(
	ReporteID int,
	AdminID int,
	EmpleadoID int,

	Asunto varchar(20),
	Prioridad varchar(20),
	Estado varchar(20),
	Descripcion varchar(100),
	CategoriaReporte varchar(20),

	primary key (ReporteID),
	foreign key (AdminID) references Administrador(AdminID),
	foreign key (EmpleadoID) references Empleado(EmpleadoID)
);

-- Tablas de Empresa

create table Tareas(
	TareaID int not null,
	Nombre varchar(50),
	Descripcion varchar(100),
	CodigoTarea varchar(5),
	Prioridad varchar(20),

	primary key (TareaID)
);

create table Operacion(
	OperacionID int not null,
	EmpleadoID int,
	TareaID int,

	primary key (OperacionID),
	foreign key (EmpleadoID) references Empleado(EmpleadoID),
	foreign key (TareaID) references Tareas(TareaID)
);

create table Almacen(
	AlmacenID int not null,
	Nombre varchar(100),
	Cantidad int,
	Direccion varchar(200),
	Telefono int,
	Correo varchar(50),
	EstadoAlmacen varchar(20),

	primary key (AlmacenID)
);

create table Nave(
	NaveID int,
	Nombre varchar(50),
	Propietario varchar(50),
	Capacidad int,
	EstadoNave varchar(20),

	primary key (NaveID)
);

create table TipoNave(
	TipoNaveID int,
	Tipo varchar(20),
	CodigoNave varchar(10),
	Descripcion varchar(100)

	primary key(TipoNaveID)
);

create table DetalleNave(
	NaveID int,
	TipoNaveID int,

	RutaOrigen varchar(50),
	RutaSalida varchar(50),
	RutaEntrada varchar(50),
	FechaSalida date,
	FechaEntrada date,

	foreign key (NaveID) references Nave(NaveID),
	foreign key (TipoNaveID) references TipoNave(TipoNaveID)
)

-- Tablas de Liquidación

create table Orden(
	OrdenID varchar(11) not null, -- Formato: 0000-2023
	CodigoRUC int not null,
	Estado varchar(10),
	Canal varchar(50),
	NaveID int,
	AlmacenID int,

	primary key (OrdenID),
	foreign key (CodigoRUC) references Cliente(CodigoRUC),
	foreign key (NaveID) references Nave(NaveID)
);

create table InfoSunat(
	NumeroDAM varchar(20),
	OrdenID varchar(11),
	
	FOB decimal(12,5),
	FLETE decimal(12,5),
	Seguro decimal(12,5),
	CIF decimal(12,5),

	primary key (NumeroDAM),
	foreign key (OrdenID) references Orden(OrdenID)
);

create table PagoCliente( --
	PagoID int identity(1,1), 
	OrdenID varchar(11),
	
	Concepto varchar(256) not null,
	CostoSol int null,
	CostoDolar int null,
	TipoCambio int,

	primary key (PagoID),
	foreign key (OrdenID) references Orden(OrdenID)
);

create table PagoAgencia(
	PagoID int identity(1,1), 
	OrdenID varchar(11),

	Concepto varchar(256) not null,	
	CostoSol int null,
	CostoDolar int null,
	TipoCambio int,

	primary key (PagoID),
	foreign key (OrdenID) references Orden(OrdenID)
);

create table Deposito(
	DepositoID int not null,
	OrdenID varchar(11),

	NumOperacion int not null,
	NombreOperacion varchar(250) not null,
	Fecha date not null,
	Banco varchar(20),

	CostoSol int,
	CostoDolar int,
	TipoCambio int,

	primary key (DepositoID),
	foreign key (OrdenID) references Orden(OrdenID)
);

create table TipoCarga(
	TipoCargaID int,
	CargaID int,

	Operacion varchar(20),
	CodigoOperacion varchar(10),
	-- varchar(100)

	primary key(TipoCargaID),
)

create table Carga(
	CargaID int,
	OrdenID varchar(11),
	TipoCargaID int,

	Peso decimal(10,5),
	Bultos int,
	CargaSuelta int,

	primary key(CargaID),
	foreign key(OrdenID) references Orden(OrdenID),
	foreign key(TipoCargaID) references TipoCarga(TipoCargaID)
)

-- Tablas de Operarios

create table OperarioExterno(
	OperarioID int,

	Nombre varchar(200),
	Correo varchar(50),	
	Usuario varchar(50),
	Contraseña varchar(50),

	primary key(OperarioID)
)

create table DetalleOperario(
	OperarioID int,

	Direccion varchar(100), 
	Salario decimal(10,8),
	Cargo varchar(20),
	DNI int,
	Estado varchar(20),
	CodigoMaestro int, -- codigo para la eliminacion y modificacion de registros

	foreign key(OperarioID) references OperarioExterno(OperarioID)
)

create table RegistroOrden(
	RegistroID int identity(1,1),
	OrdenID varchar(11),
	EmpleadoID int,
	OperarioID int,

	Estado varchar(20),		

	primary key (RegistroID),
	foreign key (OrdenID) references Orden(OrdenID),
	foreign key (EmpleadoID) references Empleado(EmpleadoID),
	foreign key (OperarioID) references OperarioExterno (OperarioID)
)

create table PagoOperario(
	PagoOperID int,
	OperarioID int,
	AdminID int,

	EstadoPago varchar(20),
	MontoPago decimal(10,5),
	Banco varchar(10),
	NumOperacion int,

	primary key (PagoOperID),
	foreign key (OperarioID) references OperarioExterno(OperarioID),
	foreign key (AdminID) references Administrador(AdminID)
)
go
