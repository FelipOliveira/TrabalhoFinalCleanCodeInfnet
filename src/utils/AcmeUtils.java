package utils;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import model.Cargo;
import model.Funcionario;
import model.FuncionarioTerceirizado;
import model.Setor;

public class AcmeUtils {

    public Funcionario criarFuncionario(String nome, String endereco, BigDecimal salario, Setor setor, Cargo cargo, List<String> telefones){
        return new Funcionario(
            nome, 
            endereco, 
            salario, 
            setor, 
            cargo, 
            telefones
        );
    }

    public Funcionario criarFuncionarioTerceirizado(String nome, String endereco, BigDecimal salario, Setor setor, Cargo cargo, List<String> telefones, String empresaContratada, LocalDate tempoPermanencia){
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

    public void listarFuncionarios(List<Funcionario> funcionarios){
        ListIterator<Funcionario> fit = funcionarios.listIterator();
        while(fit.hasNext()) System.out.println(fit.next().toString());
    }
}
