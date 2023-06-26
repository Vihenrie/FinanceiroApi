package br.com.etec.vinicius.FinanceiroApi.repository;

import br.com.etec.vinicius.FinanceiroApi.model.Contas;
import br.com.etec.vinicius.FinanceiroApi.repository.contasRepository.ContasRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContasRepository extends JpaRepository<Contas, Integer>, ContasRepositoryQuery {
}
