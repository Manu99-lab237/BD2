USE telematica2020
go

CREATE PROCEDURE SP_insertarEmpleado(
---campos a ingresar-----
@nom_empleado char(30),
@app_empleado char(30),
@apm_empleado char(30),
@sueldo_empleado int,
@fecha_ingreso_empleado date,
@nss_empleado varchar(11),
@usuario char(20),
@clave char(20)
)
AS
BEGIN
INSERT INTO dbo.empleado
---Campos de las tablas-----
([nom_empleado]
,[app_empleado]
,[apm_empleado]
,[sueldo_empleado]
,[fecha_ingreso_empleado]
,[nss_empleado]
,[usuario]
,[clave])
values
(@nom_empleado,@app_empleado,@apm_empleado,@sueldo_empleado,@fecha_ingreso_empleado,@nss_empleado,@usuario,@clave)
end 
go


create procedure SP_eliminar_empleado(@id int)
AS begin
delete from empleado where id_empleado=@id
end
go

select * from empleado;
go


create procedure SP_buscarEmpleado(@id int)
AS begin
select * from empleado where id_empleado=@id
end
go

select *from cliente
go

CREATE PROCEDURE SP_insertarCliente(
---campos a ingresar-----
@nom_cliente char(30),
@app_cliente char(30),
@apm_cliente char(30),
@rfc_cliente varchar(13)
)
AS
BEGIN
INSERT INTO dbo.cliente
---Campos de las tablas-----
([nom_cliente]
,[app_cliente]
,[apm_cliente]
,[rfc_cliente])
values
(@nom_cliente,@app_cliente,@apm_cliente,@rfc_cliente)
end 
go

create procedure SP_eliminar_cliente(@id int)
AS begin
delete from cliente where id_cliente=@id
end
go

CREATE PROCEDURE SP_insertarEstado(
---campos a ingresar-----
@nom_estado char(25)
)
AS
BEGIN
INSERT INTO dbo.estado
---Campos de las tablas-----
([nom_estado]
)
values
(@nom_estado)
end 
go

create procedure SP_eliminar_estado(@id int)
AS begin
delete from estado where id_estado=@id
end
go

CREATE PROCEDURE SP_insertarPais(
---campos a ingresar-----
@nom_pais char(30)
)
AS
BEGIN
INSERT INTO dbo.pais
---Campos de las tablas-----
([nom_pais]
)
values
(@nom_pais)
end 
go

create procedure SP_eliminar_pais(@id int)
AS begin
delete from pais where id_pais=@id
end
go