import java.math.BigDecimal;
import java.util.List;

import model.BuilderAcme;
import model.Cargo;
import model.Funcionario;
import model.FuncionarioTerceirizado;
import model.Setor;
import utils.Config;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(Config.BOOT_TEXT);

        BuilderAcme ba = new BuilderAcme();

        String func1_nome = "fulano";
        String func1_endereco = "rua dos bobos numero 0"; 
        BigDecimal func1_salario = new BigDecimal(2000);
        Setor func1_setor = Setor.BANCO_DE_DADOS;
        Cargo func1_cargo = Cargo.ESTAGIARIO;
        
        String func1_telefone1 = "0001121221";
        String func1_telefone2 = "1223243552";
        String func1_telefone3 = "7270587405";

        List<String> listaTelefones = ba.criarListaTelefones(
            func1_telefone1,
            func1_telefone2,
            func1_telefone3
        );
        
        Funcionario func1 = ba.novoFuncionario(
            func1_nome, 
            func1_endereco, 
            func1_salario, 
            func1_setor, 
            func1_cargo, 
            listaTelefones
        );

        System.out.println(func1.getSalario());
        reajusteSalarial(func1);
        
    }

    public static void reajusteSalarial(Funcionario f){
        if (f.getClass() == FuncionarioTerceirizado.class) {
            return;
        }

        switch(f.getCargo()){
            case ESTAGIARIO:
                f.setSalario(f.getSalario().multiply(Config.REAJUSTE_ESTAGIARIO));
                break;
            case JUNIOR:
                f.setSalario(f.getSalario().multiply(Config.REAJUSTE_JUNIOR));
                break;
            case PLENO:
                f.setSalario(f.getSalario().multiply(Config.REAJUSTE_PLENO));
                break;
            case SENIOR:
                f.setSalario(f.getSalario().multiply(Config.REAJUSTE_SENIOR));
                break;
            default:
                f.setSalario(f.getSalario().multiply(new BigDecimal(1)));
                break;
        }
        
        System.out.println("salário de " + f.getNome() + " aumentou para R$" + f.getSalario());
    }
}
