-- Tabla de productos
create table if not exists productos(
                                       id serial primary key,
                                       nombre varchar(32) not null unique,
                                       categoria varchar(32) not null,
                                       descripcion text
                                    );