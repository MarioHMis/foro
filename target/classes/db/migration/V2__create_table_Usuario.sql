CREATE TABLE user (
                      id BIGINT AUTO_INCREMENT PRIMARY KEY,
                      name VARCHAR(100) NOT NULL,
                      email VARCHAR(150) NOT NULL UNIQUE,
                      password VARCHAR(255) NOT NULL,
                      role_id BIGINT NOT NULL,
                      FOREIGN KEY (role_id) REFERENCES role(id)
);
