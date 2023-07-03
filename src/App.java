import java.math.BigDecimal;
import java.util.List;

import model.Cargo;
import model.Funcionario;
import model.FuncionarioTerceirizado;
import model.Setor;
import utils.AcmeUtils;
import utils.Config;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(Config.BOOT_TEXT);

        AcmeUtils au = new AcmeUtils();

        String func1_nome = "fulano";
        String func1_endereco = "rua dos bobos numero 0"; 
        BigDecimal func1_salario = new BigDecimal(2000);
        Setor func1_setor = Setor.BANCO_DE_DADOS;
        Cargo func1_cargo = Cargo.ESTAGIARIO;
        
        String[] listaTelefones = {
            "0001121221",
            "1223243552",
            "7270587405"
        };
        
        Funcionario func1 = au.criarFuncionario(
            func1_nome, 
            func1_endereco, 
            func1_salario, 
            func1_setor, 
            func1_cargo, 
            au.criarListaTelefones(listaTelefones)
        );

        System.out.println(func1.getSalario());
        reajusteSalarial(func1);

        List<Funcionario> funcioanrios = List.of(func1);
        
        au.listarFuncionarios(funcioanrios);
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
