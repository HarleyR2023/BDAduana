create view OrdenGeneral
as
	select o.OrdenID,c.Consignatario,c.ClienteID as RUC,o.Estado,o.Canal,n.nombreNave as Nave,a.NombreAlmacen as Almacen from Orden o
    inner join Cliente c on o.ClienteID = c.ClienteID
    inner join Nave n on o.NaveID = n.NaveID
    inner join Almacen a on o.AlmacenID = a.AlmacenID;
    
select * from OrdenGeneral;
