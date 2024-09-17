CREATE TABLE clientes (
    id BIGINT PRIMARY KEY DEFAULT AUTOINCREMENT,
    nombre VARCHAR(255) NOT NULL,
    direccion VARCHAR(255),
    telefono VARCHAR(50),
    email VARCHAR(255) UNIQUE
);

CREATE TABLE cuentas (
    id BIGINT PRIMARY KEY DEFAULT AUTOINCREMENT,
    cliente_id BIGINT REFERENCES clientes(id),
    numero_cuenta VARCHAR(50) UNIQUE NOT NULL,
    tipo_cuenta VARCHAR(50) NOT NULL,
    saldo DECIMAL(15, 2) DEFAULT 0.00
);

CREATE TABLE transacciones (
    id BIGINT PRIMARY KEY DEFAULT AUTOINCREMENT,
    cuenta_id BIGINT REFERENCES cuentas(id),
    fecha TIMESTAMP DEFAULT CURRENT TIMESTAMP,
    tipo_transaccion VARCHAR(50) NOT NULL,
    monto DECIMAL(15, 2) NOT NULL,
    descripcion VARCHAR(255)
);

CREATE TABLE prestamos (
    id BIGINT PRIMARY KEY DEFAULT AUTOINCREMENT,
    cliente_id BIGINT REFERENCES clientes(id),
    monto DECIMAL(15, 2) NOT NULL,
    tasa_interes DECIMAL(5, 2) NOT NULL,
    fecha_inicio DATE NOT NULL,
    fecha_fin DATE NOT NULL
);

CREATE TABLE tarjetas_credito (
    id BIGINT PRIMARY KEY DEFAULT AUTOINCREMENT,
    cliente_id BIGINT REFERENCES clientes(id),
    numero_tarjeta VARCHAR(50) UNIQUE NOT NULL,
    limite_credito DECIMAL(15, 2) NOT NULL,
    saldo_actual DECIMAL(15, 2) DEFAULT 0.00,
    fecha_expiracion DATE NOT NULL
);