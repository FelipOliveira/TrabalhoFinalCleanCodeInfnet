import java.math.BigDecimal;
import java.time.LocalDate;

import model.Cargo;
import model.Funcionario;
import model.FuncionarioTerceirizado;
import model.Setor;
import utils.Config;
import utils.Rh;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(Config.BOOT_TEXT);

        String telefone1 = "0001121221";
        String telefone2 = "122324355a";
        String telefone3 = "7270587405";
        
        Funcionario func1 = new Funcionario(
            "fulano", 
            "rua dos bobos numero 0", 
            new BigDecimal(2000), 
            Setor.BANCO_DE_DADOS, 
            Cargo.ESTAGIARIO,
            telefone1, telefone2
        );
        Funcionario func2 = new Funcionario(
            "circadiano",
            "rua dos bobos numero 1", 
            new BigDecimal(2000), 
            Setor.DEVOPS, 
            Cargo.SENIOR,
            ""
        );
        Funcionario func3 = new Funcionario(
            "marciano", 
            "rua dos bobos numero 2", 
            new BigDecimal(2000), 
            Setor.DESENVOLVIMENTO, 
            Cargo.PLENO,
            telefone3
        );

        FuncionarioTerceirizado funcTerc1 = new FuncionarioTerceirizado(
            "ciclano", 
            "rua 001", 
            new BigDecimal(2300), 
            Setor.DESENVOLVIMENTO, 
            Cargo.JUNIOR, 
            "outra empresa SA", 
            LocalDate.now().plusMonths(5),
            telefone1
        );

        FuncionarioTerceirizado funcTerc2 = new FuncionarioTerceirizado(
            "beltrano",
            "rua 002", 
            new BigDecimal(2300), 
            Setor.DEVOPS, 
            Cargo.JUNIOR, 
            "outra empresa SA", 
            LocalDate.now().plusMonths(5),
            telefone1, telefone2, telefone3
        );

        System.out.println(func1.getSalario());
        Rh.reajusteSalarial(func1);
        
    }
}
