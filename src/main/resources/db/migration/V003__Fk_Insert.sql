ALTER TABLE ContasReceber add constraint FK_ContasReceber_cliente foreign key(idCliente) references cliente(idCliente);
