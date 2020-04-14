CREATE TABLE livro(
	isbn BIGINT(20) PRIMARY KEY,
	titulo VARCHAR(50) NOT NULL,
	autor VARCHAR(50) NOT NULL,
	preco FLOAT NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


--DML
INSERT INTO livro (ISBN, titulo, autor, preco) values (58497848, 'Dança dos dragões', 'George r r martin', 25.0);
INSERT INTO livro (ISBN, titulo, autor, preco) values (15158, 'O ultimo desejo', 'Andrezj Sapkowski', 30.0);