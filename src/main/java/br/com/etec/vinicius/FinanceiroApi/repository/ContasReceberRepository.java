package br.com.etec.vinicius.FinanceiroApi.repository;

import br.com.etec.vinicius.FinanceiroApi.model.ContasReceber;
import br.com.etec.vinicius.FinanceiroApi.repository.contasReceber.ContasReceberRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContasReceberRepository extends JpaRepository<ContasReceber, Integer>, ContasReceberRepositoryQuery {
}
