package br.com.etec.vinicius.FinanceiroApi.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name="contas")
public class ContasReceber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idContas;
    private LocalDate DataConta;
    private BigDecimal ValorConta;

    @ManyToOne
    @JoinColumn(name="idCliente")
    private Cliente cliente;

    public Integer getIdContas() {
        return idContas;
    }

    public void setIdContas(Integer idContas) {
        this.idContas = idContas;
    }

    public LocalDate getDataConta() {
        return DataConta;
    }

    public void setDataConta(LocalDate dataConta) {
        DataConta = dataConta;
    }

    public BigDecimal getValorConta() {
        return ValorConta;
    }

    public void setValorConta(BigDecimal valorConta) {
        ValorConta = valorConta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContasReceber that = (ContasReceber) o;
        return Objects.equals(idContas, that.idContas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idContas);
    }
}
