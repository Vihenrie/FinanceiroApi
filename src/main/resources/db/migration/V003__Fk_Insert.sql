ALTER TABLE Contas add constraint FK_Contas_cliente foreign key(id_Cliente) references cliente(id_Cliente);

insert into cliente(nomeCliente) values ('Vinicius');
insert into Contas(data_Conta, id_Cliente, valor_Conta) values ('2023-06-25', 1, 16.32);
