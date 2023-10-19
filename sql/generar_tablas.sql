create table Cliente(
	ClienteID int,
    
    Consignatario varchar(100),
	RUC int,
    Propietario varchar(250),
	Contacto varchar(20),
    Direccion varchar(100),
    TipoCliente varchar(50),-- persona física o una entidad comercial
    EstadoCuenta varchar(50), -- si existe una orden no concluida
    Web varchar(100),
    Correo varchar(100),
    Telefono int,
    EstadoPublico varchar(50), -- deudas o problemas con la sunat
        
    primary key(ClienteID)
);

create table PaisCliente(
	PaisID int,

    Pais varchar(50),
    CodigoTelefono varchar(10),
    Region varchar(50),
    
    primary key(PaisID)
);

create table OrigenCliente(
	OrigenID int,
	PaisID int,

	Origen varchar(50), -- nacional o extranjero

	primary key(OrigenID),
	foreign key(PaisID) references PaisCliente(PaisID)
);

create table Region(
	RegionID int,
	ClienteID int,
    PaisID int,
	OrigenID int,

    Region varchar(50),
    Direccion varchar(100),
        
    primary key(RegionID),
	foreign key(ClienteID) references Cliente(ClienteID),
	foreign key(PaisID) references PaisCliente(PaisID),
	foreign key(OrigenID) references OrigenCliente(OrigenID)
);

 create table Administrador(
	 AdminID int not null,
	 nombre varchar(100),
	 apellidoPaterno varchar(50),
	 apellidoMaterno varchar(50),
	 correo varchar(50),
	 estado varchar(20),
	 usuario varchar(50),
	 contraseña varchar(50),
	 dni int,

	 primary key(AdminID)
);

 create table Empleado(
	 EmpleadoID int not null,
	 nombre varchar(100),
	 apellidoPaterno varchar(50),
	 apellidoMaterno varchar(50),
	 correo varchar(50),	
	 usuario varchar(50),
	 contraseña varchar(50),

	 primary key(EmpleadoID)	 
);

 create table DetalleEmpleado(
	
	EmpleadoID int, 

	departamento varchar(50),--posible tabla de areas de trabajo
	direccion varchar(100), 
	salario decimal(10,8),
	cargo varchar(20),
	DNI int,
	estado varchar(20),
	codigoMaestro int, -- codigo para la eliminacion y modificacion de registros

	foreign key (EmpleadoID) references Empleado(EmpleadoID)
 );

-- tabla control de trabajadores
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

-- tabla de tareas que maneja la empresa
create table Tareas( -- la tabla puede ser cada tarea que salga en la empresa no solo tareas comunes
	TareasID int,

	Tarea varchar(20),
	CodigoTarea varchar(5), -- abreviacion
	Prioridad varchar(20),
	Descripcion varchar(100),

	primary key (tareasID)
);

--tabla que recoje las operaciones asignadas a los trabajadores
create table Operacion(
	OperacionID int,
	EmpleadoID int, -- responsable de la tarea
	TareasID int,

	EstadoTarea varchar(20),
	
	primary key(OperacionID),
	foreign key (EmpleadoID) references Empleado(EmpleadoID),
	foreign key (TareasID) references Tareas(TareasID)	
);

create table Almacen( -- 
	AlmacenID int,

	NombreAlmacen varchar(50),
	Cantidad int,
	Direccion varchar(100),
	Telefono int,
	Correo varchar(50),
	EstadoAlmacen varchar(20),

	primary key (AlmacenID)
);

-- maritimo y aereo tiene otro codigo
create table Nave(
	naveID int,

	NombreNave varchar(50),
	Propietario varchar(50),
	NunRegistro int,
	Capacidad int,
	EstadoNave varchar(20),

	primary key(naveID)
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

	Modelo varchar(50),
	rutaOrigen varchar(50),
	rutaSalida varchar(50),
	rutaEntrada varchar(50),
	fechaSalida date,
	fechaEntrada date,

	foreign key (NaveID) references Nave (NaveID),
	foreign key (TipoNaveID) references TipoNave (TipoNaveID)
);

-- tabla de generacion de orden liquidación
create table Orden(
	OrdenID varchar(11),--formato 0000-2023
	ClienteID int,
    -- ruc int not null,
    Estado varchar(10),
    Canal varchar(50),
	NaveID int,
	AlmacenID int,
	--Operacion varchar(20), -- importacion o exportacion
	    	
	primary key(OrdenID),
    foreign key (ClienteID) references Cliente(ClienteID),
	foreign key (AlmacenID) references Almacen(AlmacenID),
	foreign key (NaveID) references Nave(NaveID)

	-- saldos de la empresa y el cliente
);

create table infoSunat(
	infoSunatID int,
	OrdenID varchar(11),

	DAM varchar(20),
	FOB decimal(12,5),
	FLETE decimal(12,5),
	seguro decimal(12,5),
	CIF decimal(12,5),

	primary key(DAM),
	foreign key (OrdenID) references Orden(OrdenID)
);

create table PagoCliente(
	pagoID int identity(1,1), 
	OrdenID varchar(11),
	
	Concepto varchar(256) not null,
	costoSol int null,
	costoDolar int null,
	tipoCambio int,

	primary key (PagoID),
	foreign key (OrdenID) references Orden(OrdenID)
);

create table PagoAgencia( --posible tabla sin PK relacion de pagos
	pagoID int identity(1,1), 
	OrdenID varchar(11),

	Concepto varchar(256) not null,	
	costoSol int null,
	costoDolar int null,
	tipoCambio int,

	primary key (PagoID),
	foreign key (OrdenID) references Orden(OrdenID)
);

create table Deposito(
	DepositoID int not null,
	OrdenID varchar(11),

	NumOperacion int not null,
	Banco varchar(20),
	NombreOperacion varchar(256) not null, -- nombre de la ope no existe
	Fecha date not null,

	costoSol int null,
	costoDolar int null,	
	tipoCambio int null,

	primary key (depositoID),
	foreign key (OrdenID) references Orden(OrdenID)
);

-- 
create table TipoCarga(
	CodigoCarga int,
	CargaID int,

	Operacion varchar(20), -- importacion exportacion
	-- CodigoOperacion varchar(10),

	primary key(CodigoCarga),
);

create table Carga(
	CargaID int,
	OrdenID varchar(11),
	CodigoCarga int,

	Peso decimal(10,5),
	Bultos int,
	CargaSuelta int,

	primary key(CargaID),
	foreign key(OrdenID) references Orden(OrdenID),
	foreign key(CodigoCarga) references TipoCarga(CodigoCarga)
);

create table OperarioExterno(
	OperarioID int,

	nombre varchar(100),
	apellidoPaterno varchar(50),
	apellidoMaterno varchar(50),
	correo varchar(50),	
	usuario varchar(50),
	contraseña varchar(50),

	primary key(OperarioID)
);

create table DetalleOperario(
	OperarioID int,

	direccion varchar(100), 
	salario decimal(10,8),
	cargo varchar(20),
	DNI int,
	estado varchar(20),
	codigoMaestro int, -- codigo para la eliminacion y modificacion de registros

	foreign key(OperarioID) references OperarioExterno(OperarioID)
);

create table Sede(
	SedeID int,
    Director varchar(20),
    NombreSede varchar(50),
    ruc int,
    direccion varchar(100),
    Correo varchar(50),
    TipoSede varchar(30), -- oficina principal/apoyo/registro, sucursal, centro_distribución
    Telefono int,
    Region int,
    EstadoSede varchar(20),
    
    primary key(SedeID)
);

create table RegistroOrden(
	RegistroID int,
	OrdenID varchar(11),
	EmpleadoID int,
	OperarioID int,
	SedeID int,

	Estado varchar(20),		

	primary key (RegistroID),
	foreign key (OrdenID) references Orden(OrdenID),
	foreign key (EmpleadoID) references Empleado(EmpleadoID),
	foreign key (OperarioID) references OperarioExterno (OperarioID),
	foreign key (SedeID) references Sede(SedeID)
);

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
);
