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
}
