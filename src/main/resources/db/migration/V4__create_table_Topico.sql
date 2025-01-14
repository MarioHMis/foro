CREATE TABLE topic (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       title VARCHAR(200) NOT NULL,
                       message TEXT NOT NULL,
                       creation_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                       status VARCHAR(20) NOT NULL,
                       author_id BIGINT NOT NULL,
                       course_id BIGINT NOT NULL,
                       FOREIGN KEY (author_id) REFERENCES user(id),
                       FOREIGN KEY (course_id) REFERENCES course(id)
);
