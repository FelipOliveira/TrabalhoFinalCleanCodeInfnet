package model;

import java.math.BigDecimal;
import java.util.List;

public class Funcionario {
    
    protected String nome;
    protected List<String> telefones;
    protected String endereco;
    protected BigDecimal salario;
    protected Setor setor;
    protected Cargo cargo;

    public Funcionario(String nome, String endereco, BigDecimal salario, Setor setor, Cargo cargo, List<String> telefones){
        this.nome = nome;
        this.telefones = telefones;
        this.endereco = endereco;
        this.salario = salario;
        this.setor = setor;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }
    public List<String> getTelefones() {
        return telefones;
    }
    public void setTelefones(String... telefones) {
        this.telefones = List.of(telefones);
    }
    public void addTelefone(String telefone){
        this.telefones.add(telefone);
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public BigDecimal getSalario() {
        return salario;
    }public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
    public Cargo getCargo() {
        return cargo;
    }
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    public Setor getSetor() {
        return setor;
    }
    public void setSetor(Setor setor) {
        this.setor = setor;
    }

}
