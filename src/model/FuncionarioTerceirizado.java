package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class FuncionarioTerceirizado extends Funcionario{

    private String empresaContratada;
    private LocalDate tempoPermanencia;

    public FuncionarioTerceirizado(String nome, String endereco, BigDecimal salario, Setor setor, Cargo cargo, String empresaContratada, LocalDate tempoPermanencia, List<String> telefones) {
        super(nome, endereco, salario, setor, cargo, telefones);
        this.empresaContratada = empresaContratada;
        this.tempoPermanencia = tempoPermanencia;
    }
    
    public String getEmpresaContratada() {
        return empresaContratada;
    }
    public LocalDate getTempoPermanencia() {
        return tempoPermanencia;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\n" 
        + "Endereço: " + this.endereco + "\n"
        + "Salário atual: " + this.salario + "\n"
        + "Setor: " + this.setor + "\n"
        + "Cargo:" + this.cargo + "\n"
        + "Empresa contrada: " + this.empresaContratada + "\n"
        + "Tempo de contrato: " + this.tempoPermanencia.toString() + "\n"
        + "Telefone(s): " + this.telefones.toString() + "\n";
    }
}
