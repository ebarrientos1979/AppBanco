INSERT INTO Clientes (nombre, apellido, email, telefono, direccion, fecha_registro) VALUES
('Juan', 'Pérez', 'juan.perez@example.com', '555-1234', 'Calle Falsa 123', '2023-01-01'),
('María', 'Gómez', 'maria.gomez@example.com', '555-5678', 'Avenida Siempre Viva 742', '2023-02-01'),
('Carlos', 'López', 'carlos.lopez@example.com', '555-8765', 'Boulevard de los Sueños 456', '2023-03-01'),
('Ana', 'Martínez', 'ana.martinez@example.com', '555-4321', 'Calle de la Amargura 789', '2023-04-01'),
('Luis', 'Rodríguez', 'luis.rodriguez@example.com', '555-6789', 'Avenida de la Paz 101', '2023-05-01'),
('Laura', 'Fernández', 'laura.fernandez@example.com', '555-9876', 'Calle del Sol 202', '2023-06-01'),
('Jorge', 'Sánchez', 'jorge.sanchez@example.com', '555-5432', 'Avenida del Mar 303', '2023-07-01'),
('Marta', 'Ramírez', 'marta.ramirez@example.com', '555-2109', 'Calle de la Luna 404', '2023-08-01'),
('Pedro', 'Torres', 'pedro.torres@example.com', '555-6543', 'Boulevard del Cielo 505', '2023-09-01'),
('Sofía', 'Vargas', 'sofia.vargas@example.com', '555-3210', 'Avenida de las Estrellas 606', '2023-10-01');

INSERT INTO Cuentas (numero_cuenta, tipo_cuenta, saldo, fecha_apertura, cliente_id) VALUES
('1001', 'ahorro', 1500.00, '2023-01-10', 1),
('1002', 'corriente', 2500.00, '2023-02-15', 2),
('1003', 'ahorro', 3500.00, '2023-03-20', 3),
('1004', 'corriente', 4500.00, '2023-04-25', 4),
('1005', 'ahorro', 5500.00, '2023-05-30', 5),
('1006', 'corriente', 6500.00, '2023-06-05', 6),
('1007', 'ahorro', 7500.00, '2023-07-10', 7),
('1008', 'corriente', 8500.00, '2023-08-15', 8),
('1009', 'ahorro', 9500.00, '2023-09-20', 9),
('1010', 'corriente', 10500.00, '2023-10-25', 10);

INSERT INTO Transacciones (fecha, monto, tipo, cuenta_id) VALUES
('2023-01-11', 200.00, 'depósito', 1),
('2023-02-16', 300.00, 'retiro', 2),
('2023-03-21', 400.00, 'depósito', 3),
('2023-04-26', 500.00, 'retiro', 4),
('2023-05-31', 600.00, 'depósito', 5),
('2023-06-06', 700.00, 'retiro', 6),
('2023-07-11', 800.00, 'depósito', 7),
('2023-08-16', 900.00, 'retiro', 8),
('2023-09-21', 1000.00, 'depósito', 9),
('2023-10-26', 1100.00, 'retiro', 10);

INSERT INTO Prestamos (monto, tasa_interes, fecha_inicio, fecha_fin, cliente_id) VALUES
(5000.00, 5.5, '2023-01-15', '2024-01-15', 1),
(6000.00, 6.0, '2023-02-20', '2024-02-20', 2),
(7000.00, 6.5, '2023-03-25', '2024-03-25', 3),
(8000.00, 7.0, '2023-04-30', '2024-04-30', 4),
(9000.00, 7.5, '2023-05-05', '2024-05-05', 5),
(10000.00, 8.0, '2023-06-10', '2024-06-10', 6),
(11000.00, 8.5, '2023-07-15', '2024-07-15', 7),
(12000.00, 9.0, '2023-08-20', '2024-08-20', 8),
(13000.00, 9.5, '2023-09-25', '2024-09-25', 9),
(14000.00, 10.0, '2023-10-30', '2024-10-30', 10);

INSERT INTO Pagos (fecha_pago, monto, prestamo_id) VALUES
('2023-02-15', 500.00, 1),
('2023-03-20', 600.00, 2),
('2023-04-25', 700.00, 3),
('2023-05-30', 800.00, 4),
('2023-06-05', 900.00, 5),
('2023-07-10', 1000.00, 6),
('2023-08-15', 1100.00, 7),
('2023-09-20', 1200.00, 8),
('2023-10-25', 1300.00, 9),
('2023-11-30', 1400.00, 10);