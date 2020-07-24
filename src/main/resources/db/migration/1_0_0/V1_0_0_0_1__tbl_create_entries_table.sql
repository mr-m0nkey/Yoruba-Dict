CREATE TABLE IF NOT EXISTS entries (
	id  BIGINT  NOT NULL    PRIMARY KEY AUTO_INCREMENT,
    word   VARCHAR(255)    NOT NULL,
    definition   VARCHAR(255)   NOT NULL,
    example_sentences TEXT
);
