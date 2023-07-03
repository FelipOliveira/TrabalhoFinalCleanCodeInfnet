package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class BuilderAcme {

    public Funcionario novoFuncionario(String nome, String endereco, BigDecimal salario, Setor setor, Cargo cargo, List<String> telefones){
        return new Funcionario(
            nome, 
            endereco, 
            salario, 
            setor, 
            cargo, 
            telefones
        );
    }

    public Funcionario novoFuncionarioTerceirizado(String nome, String endereco, BigDecimal salario, Setor setor, Cargo cargo, List<String> telefones, String empresaContratada, LocalDate tempoPermanencia){
        return new FuncionarioTerceirizado(
            nome, 
            endereco, 
            salario, 
            setor, 
            cargo, 
            empresaContratada,
            tempoPermanencia,
            telefones
        );
    }

    public List<String> criarListaTelefones(String... telefones){
        return List.of(telefones);
    }
}
