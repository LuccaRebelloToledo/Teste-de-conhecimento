CREATE TABLE estagio (
id_candidato INT PRIMARY KEY NOT NULL,
nome_candidato VARCHAR(100) NOT NULL,
nota_recebida DECIMAL(3,2) NOT NULL,
aprovado BIT DEFAULT 0 NOT NULL
);