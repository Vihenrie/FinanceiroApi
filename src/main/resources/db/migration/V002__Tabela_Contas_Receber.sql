Create Table ContasReceber(
    id_Contas int not null AUTO_INCREMENT primary key,
    DataConta date not null,
    ValorConta decimal(12,2) not null,
    id_Cliente int not null
);