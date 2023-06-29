package br.com.etec.vinicius.FinanceiroApi.repository.contas;

import br.com.etec.vinicius.FinanceiroApi.model.Contas;
import br.com.etec.vinicius.FinanceiroApi.repository.projections.ContasDto;
import br.com.etec.vinicius.FinanceiroApi.repository.filter.ContasFilter;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ContasRepositoryImpl implements ContasRepositoryQuery {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public Page<ContasDto> Filtrar(ContasFilter contasFilter, Pageable pageable) {

        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<ContasDto> criteria = builder.createQuery(ContasDto.class);
        Root<Contas> root = criteria.from(Contas.class);

        criteria.select(builder.construct(ContasDto.class,
                root.get("id_Contas"),
                root.get("dataconta"),
                root.get("valorconta"),
                root.get("cliente").get("nomeCliente")
        ));

        Predicate[] predicates = criarRestricoes(contasFilter, builder, root);
        criteria.where(predicates);
        criteria.orderBy(builder.asc(root.get("dataconta")));

        TypedQuery<ContasDto> query = manager.createQuery(criteria);
        addRestricoesDePag(query, pageable);

        return new PageImpl<>(query.getResultList(), pageable, total(contasFilter));
    }

    private void addRestricoesDePag(TypedQuery<ContasDto> query, Pageable pageable) {
        int pagAtual = pageable.getPageNumber();        //Pagina Atual
        int totRegPorPag = pageable.getPageSize();      //Total Registro Por Pagina
        int primeRegPag = pagAtual * totRegPorPag;      //Primeiro Registro da Pagina

        query.setFirstResult(primeRegPag);
        query.setMaxResults(totRegPorPag);
    }

    private Long total(ContasFilter contasFilter) {
        CriteriaBuilder builder = manager.getCriteriaBuilder();;
        CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
        Root<Contas> root = criteria.from(Contas.class);

        Predicate[] predicates = criarRestricoes(contasFilter, builder, root);
        criteria.where(predicates);
        criteria.orderBy(builder.asc(root.get("dataconta")));

        criteria.select(builder.count(root));

        return  manager.createQuery(criteria).getSingleResult();
    }

    private Predicate[] criarRestricoes(ContasFilter contasFilter, CriteriaBuilder builder, Root<Contas> root){

        List<Predicate> predicates = new ArrayList<>();
        if(!StringUtils.isEmpty(contasFilter.getNomeCliente())) {
            predicates.add(builder.like(builder.lower(root.get("cliente").get("nomeCliente")),
                    "%" + contasFilter.getNomeCliente().toLowerCase() + "%"));
        }

        if(contasFilter.getDataconta() != null) {
            predicates.add(builder.equal(root.get("dataconta"),
                    contasFilter.getDataconta()));
        }

        if(contasFilter.getValorconta() != null) {
            predicates.add(builder.lessThanOrEqualTo(root.get("valorconta"),
                    contasFilter.getValorconta()));
        }

        return predicates.toArray(new Predicate[predicates.size()]);
    }
}
