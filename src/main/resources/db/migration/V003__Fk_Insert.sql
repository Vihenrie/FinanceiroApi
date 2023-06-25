ALTER TABLE ContasReceber add constraint FK_ContasReceber_cliente foreign key(id_Cliente) references cliente(id_Cliente);

insert into cliente(nomeCliente) values ('Vinicius');
insert into ContasReceber(DataConta, id_Cliente, ValorConta) values ('2023-06-25', 1, 16.32);
