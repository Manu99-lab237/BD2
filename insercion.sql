use telematica2020
go
SET IDENTITY_INSERT cliente ON
insert into "cliente"("id_cliente","nom_cliente","app_cliente","apm_cliente","rfc_cliente")
values(003,'Rodrigo','Rodriguez','Ramos','RORR00407AZ2')
SET IDENTITY_INSERT cliente OFF
go


update "cliente"
	set  apm_cliente = 'Victorino'
	where [id_cliente]=1;
go

select * from cliente
go


update "empleado"
set nom_empleado='Rema', app_empleado='Rolo', apm_empleado='Hevi', sueldo_empleado=1200, fecha_ingreso_empleado='2020/19/02',nss_empleado=1234567
where [id_empleado]=1;
go

select * from empleado
go


INSERT INTO empleado("nom_empleado","app_empleado","apm_empleado","sueldo_empleado","fecha_ingreso_empleado","nss_empleado","usuario","clave")
 values ('REMA','ROLO','HEVI',3000,'2020/02/20',5465546,'fsociety','leavemehere.txt');
