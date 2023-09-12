use BDAduana;

-- Tabla de Gastos Portuarios
create table GastosPortuarios (
	codigo int not null,
	fecha date not null,
	
	-- Definición de clave primaria
	primary key (codigo)
);

-- Tabla de Pagos
create table Pago (
	codigo int not null,
	codigoGP int not null,
	nombre varchar(256),
	costoSolAgencia int,
	costoSolCliente int,
	costoDolarAgencia int,
	costoDolarCliente int,

	-- Definición de claves primarias y foráneas
	primary key (codigo),
	foreign key (codigoGP) references GastosPortuarios(codigo)
);

-- Tabla de Gastos Efectuados
create table GastosEfectuados (
	RUC int not null,
	estado varchar(20) not null,
	canal varchar(20) not null,
	nave varchar(256) not null,
	almacen varchar(256) not null,
	codigoGP int not null,

	-- C.I.F
	numeroDAM int not null,
	FOB int not null,
	flete int not null,
	seguro int not null,
	verificado int not null, -- Un entero que cuenta con dos valores (0 = falso, 1 = verdadero)

	-- Definición de claves primarias y foráneas
	primary key (ruc),
	foreign key (codigoGP) references GastosPortuarios(codigo)
);

-- Tabla de Depósitos
create table Deposito (
	codigo int not null,
	codigoGE int not null,
	nombre varchar(256) not null,
	costoDolar int,
	costoSol int,

	-- Definición de claves primarias y foráneas
	primary key (codigo),
	foreign key (codigoGE) references GastosEfectuados(RUC)
);