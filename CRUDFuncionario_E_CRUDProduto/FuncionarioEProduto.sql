create database dbproduto;

use dbproduto;

create table produto (
	idproduto int not null auto_increment primary key,
	nome varchar(255),
	fabricante varchar(255),
	valor double,
	peso double
);

create table funcionario (
	idfuncionario int not null auto_increment primary key,
	nome varchar(255),
	numeroMatricula varchar(255),
	cpf varchar(12)
);

insert into funcionario (nome, numeroMatricula, cpf) values ('Thiago', '321321321', '645654654');
insert into funcionario (nome, numeroMatricula, cpf) values ('Joao', '654987987', '987654321');
insert into funcionario (nome, numeroMatricula, cpf) values ('Marcio', '123456', '123456789');
insert into produto (nome, fabricante, valor, peso) values ('Caneta', 'Faber', 2.5, 0.1);
insert into produto (nome, fabricante, valor, peso) values ('Lapis', 'Faber', 2.5, 0.1);
insert into produto (nome, fabricante, valor, peso) values ('Caderno', 'Cadernaria', 12.5, 0.7);