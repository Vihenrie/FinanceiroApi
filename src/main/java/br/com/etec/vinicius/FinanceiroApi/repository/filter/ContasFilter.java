package br.com.etec.vinicius.FinanceiroApi.repository.filter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ContasFilter {

    private LocalDate data_Conta;
    private BigDecimal valor_Conta;

    public LocalDate getData_Conta() {
        return data_Conta;
    }

    public void setData_Conta(LocalDate data_Conta) {
        this.data_Conta = data_Conta;
    }

    public BigDecimal getValor_Conta() {
        return valor_Conta;
    }

    public void setValor_Conta(BigDecimal valor_Conta) {
        this.valor_Conta = valor_Conta;
    }
}
