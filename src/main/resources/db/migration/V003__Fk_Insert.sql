ALTER TABLE Contas add constraint FK_Contas_cliente foreign key(id_Cliente) references cliente(id_Cliente);

insert into cliente(nomeCliente) values ('Vinicius');
insert into cliente(nomeCliente) values ('Bianca');
insert into cliente(nomeCliente) values ('Matheus');
insert into cliente(nomeCliente) values ('Pedro');
insert into cliente(nomeCliente) values ('Isabella');
insert into cliente(nomeCliente) values ('Rosemeire');
insert into cliente(nomeCliente) values ('Alex');
insert into cliente(nomeCliente) values ('Livia');
insert into cliente(nomeCliente) values ('Solange');
insert into cliente(nomeCliente) values ('Nivaldo');

insert into Contas(dataconta, id_Cliente, valorconta) values ('2023-06-25', 1, 16.32);
insert into Contas(dataconta, id_Cliente, valorconta) values ('2022-09-23', 2, 123.23);
insert into Contas(dataconta, id_Cliente, valorconta) values ('2021-02-14', 3, 43.87);
insert into Contas(dataconta, id_Cliente, valorconta) values ('2020-01-02', 4, 878.65);
insert into Contas(dataconta, id_Cliente, valorconta) values ('2021-10-01', 5, 34.76);
insert into Contas(dataconta, id_Cliente, valorconta) values ('2022-11-30', 6, 5461.23);
insert into Contas(dataconta, id_Cliente, valorconta) values ('2023-12-12', 7, 102.00);
insert into Contas(dataconta, id_Cliente, valorconta) values ('2022-02-20', 8, 87.32);
insert into Contas(dataconta, id_Cliente, valorconta) values ('2021-04-17', 9, 987.54);
insert into Contas(dataconta, id_Cliente, valorconta) values ('2020-06-29', 10, 65.23);
