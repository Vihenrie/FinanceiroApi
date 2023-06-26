package br.com.etec.vinicius.FinanceiroApi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id_Cliente;

    @Column(name = "nomecliente")
    private String nomeCliente;

    @OneToMany(mappedBy = "cliente")
    private List<Contas> Contas = new ArrayList<>();

    public Integer getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(Integer id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id_Cliente, cliente.id_Cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_Cliente);
    }
}
