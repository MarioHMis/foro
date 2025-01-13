CREATE TABLE Topico (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        titulo VARCHAR(255) NOT NULL,
                        mensaje TEXT NOT NULL,
                        fechaCreacion DATETIME DEFAULT CURRENT_TIMESTAMP,
                        status ENUM('abierto', 'cerrado') DEFAULT 'abierto',
                        autor INT,
                        curso INT,
                        FOREIGN KEY (autor) REFERENCES Usuario(id),
                        FOREIGN KEY (curso) REFERENCES Curso(id)
);
