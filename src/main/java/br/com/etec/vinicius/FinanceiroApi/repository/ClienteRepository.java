package br.com.etec.vinicius.FinanceiroApi.repository;

import br.com.etec.vinicius.FinanceiroApi.model.Cliente;
import br.com.etec.vinicius.FinanceiroApi.repository.cliente.ClienteRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>, ClienteRepositoryQuery {
}
