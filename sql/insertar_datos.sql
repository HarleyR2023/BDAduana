insert into Cliente(ClienteID,Consignatario,Ruc,Direccion,TipoCliente,EstadoCuenta,Telefono)
values(2,'DREYCOM ELECTRONIC´S S.A.C',20602272151,'Av. Ave 1323','Entidad','Concluida',999222111);

select * from Cliente;

insert into Nave(NaveID,NombreNave)
values(3,'EVER LOYAL-0632-O-SB-DF');

insert into Almacen(AlmacenID,NombreAlmacen)
values(4,'VILLAS OQUENDO S.A');

select * from Nave;

select * from Almacen;

insert into Orden
values('1031-2023',2,'Concluido','Rojo',3,4);