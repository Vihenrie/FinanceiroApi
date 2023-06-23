create table ContasReceber(
    idContas int not null auto_increment primary key,
    DataConta date not null,
    idCliente int not null,
    ValorConta decimal(12,2)
);