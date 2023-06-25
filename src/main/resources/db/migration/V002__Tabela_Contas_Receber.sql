create table ContasReceber(
    idContas int not null AUTO_INCREMENT primary key,
    DataConta date not null,
    idCliente int not null,
    ValorConta decimal(12,2) not null
);