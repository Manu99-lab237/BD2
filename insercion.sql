use telematica2020
go

insert into "cliente"("nom_cliente","app_cliente","apm_cliente","rfc_cliente")
values('Rodrigo','Rodriguez','Ramos','RORR00407AZ2')

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

 INSERT INTO empleado("nom_empleado","app_empleado","apm_empleado","sueldo_empleado","fecha_ingreso_empleado","nss_empleado","usuario","clave")
 values ('Jose Manuel','Lopez','Victorino',4000,'2020/02/24',653189,'admin','admin2020');

 delete from empleado
 where id_empleado=4;
 go

 INSERT INTO telefono("num_tel","descripcion_tel")
 values ('3412389358','Trabajo');
 go

 select * from telefono

 INSERT INTO cliente_telefono("id_cliente","id_tel")
 values(6,5);


 select * from cliente_telefono
