package br.com.etec.vinicius.FinanceiroApi.repository.filter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ContasFilter {

    private LocalDate dataconta;
    private BigDecimal valorconta;
    private String nomeCliente;


    public LocalDate getDataconta() {
        return dataconta;
    }

    public void setDataconta(LocalDate dataconta) {
        this.dataconta = dataconta;
    }

    public BigDecimal getValorconta() {
        return valorconta;
    }

    public void setValorconta(BigDecimal valorconta) {
        this.valorconta = valorconta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}
