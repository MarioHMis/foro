CREATE TABLE Usuario (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         nombre VARCHAR(100) NOT NULL,
                         email VARCHAR(255) UNIQUE NOT NULL,
                         contrasena VARCHAR(255) NOT NULL,
                         perfiles INT,
                         FOREIGN KEY (perfiles) REFERENCES Perfil(id)
);
