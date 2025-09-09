-- V2: Migrations para adicionar a Coluna de Semestre na tabela de Cadastro

ALTER TABLE tb_cadastro
ADD COLUMN semestre VARCHAR(255);



