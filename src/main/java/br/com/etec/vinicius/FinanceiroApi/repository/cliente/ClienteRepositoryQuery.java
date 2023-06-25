package br.com.etec.vinicius.FinanceiroApi.repository.cliente;

import br.com.etec.vinicius.FinanceiroApi.model.Cliente;
import br.com.etec.vinicius.FinanceiroApi.repository.filter.ClienteFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ClienteRepositoryQuery {

    public Page<Cliente> Filtrar(ClienteFilter clienteFilter, Pageable pageable);

}
