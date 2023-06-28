package br.com.etec.vinicius.FinanceiroApi.repository.contas;

import br.com.etec.vinicius.FinanceiroApi.repository.projections.ContasDto;
import br.com.etec.vinicius.FinanceiroApi.repository.filter.ContasFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ContasRepositoryQuery {

    public Page<ContasDto> Filtrar(ContasFilter clienteFilter, Pageable pageable);

}
