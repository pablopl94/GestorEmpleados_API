CREATE DATABASE IF NOT EXISTS controlempleados_db;
USE controlempleados_db;

-- Tabla de roles
CREATE TABLE usuarios (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellidos VARCHAR(150) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL
);

INSERT INTO usuarios (nombre, apellidos, email) VALUES
('Carlos', 'Gómez Pérez', 'carlos.gomez@example.com'),
('Laura', 'Fernández Ruiz', 'laura.fernandez@example.com'),
('Miguel', 'Martínez López', 'miguel.martinez@example.com'),
('Ana', 'Sánchez García', 'ana.sanchez@example.com'),
('Javier', 'Díaz Hernández', 'javier.diaz@example.com'),
('María', 'López Torres', 'maria.lopez@example.com'),
('David', 'Gutiérrez Ramos', 'david.gutierrez@example.com'),
('Sandra', 'Ramírez Castro', 'sandra.ramirez@example.com'),
('Pablo', 'Jiménez Morales', 'pablo.jimenez@example.com'),
('Elena', 'Hernández Vega', 'elena.hernandez@example.com');
