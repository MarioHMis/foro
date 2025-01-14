CREATE TABLE reply (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       message TEXT NOT NULL,
                       creation_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                       is_solution BOOLEAN NOT NULL DEFAULT FALSE,
                       author_id BIGINT NOT NULL,
                       topic_id BIGINT NOT NULL,
                       FOREIGN KEY (author_id) REFERENCES user(id),
                       FOREIGN KEY (topic_id) REFERENCES topic(id)
);
