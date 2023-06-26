package br.com.etec.vinicius.FinanceiroApi.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name="contas")
public class Contas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id_Contas;
    private LocalDate data_Conta;
    private BigDecimal valor_Conta;

    @ManyToOne
    @JoinColumn(name="id_Cliente")
    private Cliente cliente;

    public Integer getId_Contas() {
        return id_Contas;
    }

    public void setId_Contas(Integer id_Contas) {
        this.id_Contas = id_Contas;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contas contas = (Contas) o;
        return Objects.equals(id_Contas, contas.id_Contas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_Contas);
    }
}