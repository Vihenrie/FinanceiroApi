Create Table Contas(
    id_Contas int not null AUTO_INCREMENT primary key,
    dataconta date not null,
    valorconta decimal(12,2) not null,
    id_Cliente int not null
);