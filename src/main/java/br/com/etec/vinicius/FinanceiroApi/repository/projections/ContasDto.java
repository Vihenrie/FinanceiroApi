package br.com.etec.vinicius.FinanceiroApi.repository.projections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class ContasDto {

    private Integer id_Contas;
    private LocalDate dataconta;
    private BigDecimal valorconta;
    private String nomeCliente;

    public ContasDto(Integer id_Contas, LocalDate dataconta, BigDecimal valorconta, String nomecliente){
        this.id_Contas = id_Contas;
        this.dataconta = dataconta;
        this.valorconta = valorconta;
        this.nomeCliente = nomecliente;
    }

    public Integer getId_Contas() {
        return id_Contas;
    }

    public void setId_Contas(Integer id_Contas) {
        this.id_Contas = id_Contas;
    }

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
