package br.com.etec.vinicius.FinanceiroApi.resource;

import br.com.etec.vinicius.FinanceiroApi.model.Contas;
import br.com.etec.vinicius.FinanceiroApi.repository.projections.ContasDto;
import br.com.etec.vinicius.FinanceiroApi.repository.ContasRepository;
import br.com.etec.vinicius.FinanceiroApi.repository.filter.ContasFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contas")
public class ContasResource {
    @Autowired
    private ContasRepository contasRepository;

    @GetMapping
    public Page<ContasDto> pesquisar(ContasFilter contasFilter, Pageable pageable){
        return contasRepository.Filtrar(contasFilter, pageable);
    }

    @GetMapping("/todos")
    public List<Contas> listAllContas() {
        return contasRepository.findAll();
    }
}
