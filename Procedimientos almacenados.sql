USE telematica2020
go

CREATE PROCEDURE SP_insertarEmpleado(
---campos a ingresar-----
@nom_empleado char(30),
@app_empleado char(30),
@apm_empleado char(30),
@sueldo_empleado int,
@fecha_ingreso_empleado date,
@nss_empleado char(11),
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





create procedure mostrar_empleado
AS
select * from empleado
go

