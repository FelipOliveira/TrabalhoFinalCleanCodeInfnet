package utils;

import java.math.BigDecimal;
import model.Funcionario;
import model.FuncionarioTerceirizado;

public class Rh {

    public static void reajusteSalarial(Funcionario f){
        BigDecimal reajuste;

        if (f.getClass() == FuncionarioTerceirizado.class) {
            return;
        }

        switch(f.getCargo()){
            case ESTAGIARIO:
                reajuste = Config.REAJUSTE_ESTAGIARIO;
                break;
            case JUNIOR:
                reajuste = Config.REAJUSTE_JUNIOR;
                break;
            case PLENO:
                reajuste = Config.REAJUSTE_PLENO;
                break;
            case SENIOR:
                reajuste = Config.REAJUSTE_SENIOR;
                break;
            default:
                reajuste = new BigDecimal(1);
                break;
        }
        
        f.setSalario(f.getSalario().multiply(reajuste));
        System.out.println("salário de " + f.getNome() + " aumentou para " + f.getSalario());
    }

}
