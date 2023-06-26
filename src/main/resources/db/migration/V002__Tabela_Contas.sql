Create Table Contas(
    id_Contas int not null AUTO_INCREMENT primary key,
    data_Conta date not null,
    valor_Conta decimal(12,2) not null,
    id_Cliente int not null
);