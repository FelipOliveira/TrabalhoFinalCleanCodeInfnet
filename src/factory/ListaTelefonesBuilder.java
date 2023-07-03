package factory;

import java.util.List;

public class ListaTelefonesBuilder {

    public List<String> criarListaTelefones(String... telefones){
        return List.of(telefones);
    }
}
