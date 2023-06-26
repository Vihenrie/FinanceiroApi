package br.com.etec.vinicius.FinanceiroApi.repository.contasRepository;

import br.com.etec.vinicius.FinanceiroApi.model.Contas;
import br.com.etec.vinicius.FinanceiroApi.repository.filter.ContasFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ContasRepositoryQuery {

    public Page<Contas> Filtrar(ContasFilter clienteFilter, Pageable pageable);

}
