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

create procedure SP_modificarEmpleado( @id int )
---CAMPOS A MODIFICAR----(
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
UPDATE [dbo].[empleado]
   SET [nom_empleado] = @nom_empleado
      ,[app_empleado] = @app_empleado
      ,[apm_empleado] = @apm_empleado
      ,[sueldo_empleado] = @sueldo_empleado
      ,[fecha_ingreso_empleado] = @fecha_ingreso_empleado
      ,[nss_empleado] = @nss_empleado
      ,[usuario] = @usuario
      ,[clave] = @clave
 WHERE empleado.id_empleado=@id_empleado
END
GO



create procedure SP_buscarEmpleado(@id int)
AS begin
select * from empleado where id_empleado=@id
end
go
select *from empleado

