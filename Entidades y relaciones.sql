use telematica2020
go



create table cliente(
	id_cliente int identity,
	nom_cliente char (30),
	app_cliente char (30),
	apm_cliente char (30),
	rfc_cliente varchar (13),
	primary key	(id_cliente)
)
go

create table estado(
	id_estado int identity,
	nom_estado char (25),
	primary key	(id_estado)
)
go

create table pais(
	id_pais int identity,
	nom_pais char (30),
	primary key	(id_pais)
)
go

create table sucursal(
	id_suc int identity,
	nom_suc char (30),
	primary key	(id_suc)
)
go

create table horario(
	id_horario int identity,
	dia date,
	hora_entrada time,
	hora_salida time,
	primary key	(id_horario)
)
go

create table color(
	id_color int identity,
	nom_color char (30),
	primary key	(id_color)
)
go

create table colonia(
	id_colonia int identity,
	nom_colonia char (30),
	cp int,
	primary key	(id_colonia)
)
go

create table telefono(
	id_tel int identity,
	num_tel int,
	descripcion_tel char (30),
	primary key	(id_tel)
)
go

create table correo(
	id_correo int identity,
	correo char (50),
	descripcion_correo char (30),
	primary key	(id_correo)
)
go

create table paquete(
	id_paq int identity,
	nom_paq char (30),
	peso_paq varchar (15),
	dimensiones_paq varchar (15),
	primary key	(id_paq)
)
go

create table ciudad(
	id_ciudad int identity,
	nom_ciudad char (40),
	primary key	(id_ciudad)
)
go

create table destino(
	id_destino int identity,
	nom_destino char (40),
	primary key	(id_destino)
)
go

create table origen(
	id_origen int identity,
	nom_origen char (40),
	primary key	(id_origen)
)
go

create table metodo_pago(
	id_pago int identity,
	monto_pago int,
	tipo_pago char (30),
	forma_pago char (30),
	primary key	(id_pago)
)
go

create table empleado(
	id_empleado int identity,
	nom_empleado char (30),
	app_empleado char (30),
	apm_empleado char (30),
	sueldo_empleado int,
	fecha_ingreso_empleado date,
	nss_empleado int,
	usuario char (20),
	clave char (20),
	primary key	(id_empleado)
)
go

create table vehiculo(
	id_veh int identity,
	mod_veh varchar (15),
	tipo_veh char (30),
	placa_veh varchar (10),
	no_serie char (20),
	desc_veh varchar (30),
	capac_veh int,
	primary key	(id_veh)
)
go

create table direccion(
	id_dir int identity,
	calle char (15),
	num_ext int,
	num_int int,
	descripcion char (40),
	primary key	(id_dir)
)
go


/*Relaciones*/
create table cliente_telefono(
	id_cliente int,
	id_tel int,
	foreign key (id_cliente) references cliente(id_cliente),
	foreign key (id_tel) references telefono(id_tel),
)
go

create table compra(
	id_paq int,
	id_cliente int,
	foreign key (id_paq) references paquete(id_paq),
	foreign key (id_cliente) references cliente(id_cliente),
)
go


create table correo_cliente(
	id_correo int,
	id_cliente int,
	foreign key (id_correo) references correo(id_correo),
	foreign key (id_cliente) references cliente(id_cliente),
)
go

create table correo_destino(
	id_correo int,
	id_destino int,
	foreign key (id_correo) references correo(id_correo),
	foreign key (id_destino) references destino(id_destino),
)
go


create table correo_origen(
	id_correo int,
	id_origen int,
	foreign key (id_correo) references correo(id_correo),
	foreign key (id_origen) references origen(id_origen),
)
go


create table correo_sucursal(
	id_correo int,
	id_suc int,
	foreign key (id_correo) references correo(id_correo),
	foreign key (id_suc) references sucursal(id_suc),
)
go

create table devolucion(
	id_destino int,
	id_paq int,
	foreign key (id_destino) references destino(id_destino),
	foreign key (id_paq) references paquete(id_paq),
)
go

create table direccion_cliente(
	id_dir int,
	id_cliente int,
	foreign key (id_dir) references direccion(id_dir),
	foreign key (id_cliente) references cliente(id_cliente),
)
go

create table direccion_destino(
	id_dir int,
	id_destino int,
	foreign key (id_dir) references direccion(id_dir),
	foreign key (id_destino) references destino(id_destino),
)
go

create table direccion_origen(
	id_dir int,
	id_origen int,
	foreign key (id_dir) references direccion(id_dir),
	foreign key (id_origen) references origen(id_origen),
)
go

create table direccion_sucursal(
	id_dir int,
	id_suc int,
	foreign key (id_dir) references direccion(id_dir),
	foreign key (id_suc) references sucursal(id_suc),
)
go

create table empleado_correo(
	id_empleado int,
	id_correo int,
	foreign key (id_empleado) references empleado(id_empleado),
	foreign key (id_correo) references correo(id_correo),
)
go

create table empleado_direccion(
	id_empleado int,
	id_dir int,
	foreign key (id_empleado) references empleado(id_empleado),
	foreign key (id_dir) references direccion(id_dir),
)
go

create table empleado_horario(
	id_empleado int,
	id_horario int,
	foreign key (id_empleado) references empleado(id_empleado),
	foreign key (id_horario) references horario(id_horario ),
)
go

create table empleado_sucursal(
	id_empleado int,
	id_suc int,
	foreign key (id_empleado) references empleado(id_empleado),
	foreign key (id_suc) references sucursal(id_suc),
)
go

create table empleado_telefono(
	id_empleado int,
	id_tel int,
	foreign key (id_empleado) references empleado(id_empleado),
	foreign key (id_tel) references telefono(id_tel),
)
go

create table empleado_vehiculo(
	id_empleado int,
	id_veh int,
	foreign key (id_empleado) references empleado(id_empleado),
	foreign key (id_veh) references vehiculo(id_veh),
)
go

create table envio(
	id_paq int,
	id_origen int,
	id_destino int,
	foreign key (id_paq) references paquete(id_paq),
	foreign key (id_origen) references origen(id_origen),
	foreign key (id_destino) references destino(id_destino),
)
go

create table ruta(
	id_veh int,
	id_origen int,
	id_destino int,
	foreign key (id_veh) references vehiculo(id_veh),
	foreign key (id_origen) references origen(id_origen),
	foreign key (id_destino) references destino(id_destino),
)
go

create table sucursal_telefono(
	id_suc int,
	id_tel int,
	foreign key (id_suc) references sucursal(id_suc),
	foreign key (id_tel) references telefono(id_tel),
)
go

create table telefono_destino(
	id_tel int,
	id_destino int,
	foreign key (id_destino) references destino(id_destino),
	foreign key (id_tel) references telefono(id_tel),
)
go

create table telefono_origen(
	id_tel int,
	id_origen int,
	foreign key (id_origen) references origen(id_origen),
	foreign key (id_tel) references telefono(id_tel),
)
go

/*Pendiente la tabla seguimiento y area empleado*/