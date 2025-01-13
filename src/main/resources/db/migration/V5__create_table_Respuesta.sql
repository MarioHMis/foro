CREATE TABLE Respuesta (
                           id INT AUTO_INCREMENT PRIMARY KEY,
                           mensaje TEXT NOT NULL,
                           topico INT,
                           fechaCreacion DATETIME DEFAULT CURRENT_TIMESTAMP,
                           autor INT,
                           solucion BOOLEAN DEFAULT FALSE,
                           FOREIGN KEY (topico) REFERENCES Topico(id),
                           FOREIGN KEY (autor) REFERENCES Usuario(id)
);
