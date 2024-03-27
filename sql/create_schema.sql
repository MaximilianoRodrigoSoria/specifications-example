-- Tabla de productos
create table if not exists productos(
                                       id serial primary key,
                                       nombre varchar(32) not null unique,
                                       categoria varchar(32) not null,
                                       descripcion text,
                                       isActive BOOLEAN NOT NULL,
                                       createdAt TIMESTAMP NOT NULL,
                                       createdBy VARCHAR(255) NOT NULL,
                                       updatedAt TIMESTAMP,
                                       updatedBy VARCHAR(255)
                                    );