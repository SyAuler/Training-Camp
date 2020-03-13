package dao;

import model.ModelDados;
import model.ModelProdutora;
import java.util.List;

public class DAOProdutora {
    
    public List<ModelProdutora> getLista() {
        return ModelDados.listaProdutora;
    }

    public boolean salvar(ModelProdutora obj) {

        if (obj.getCodigo() == null) {
            Integer codigo = ModelDados.listaProdutora.size() + 1;
            obj.setCodigo(codigo);
            ModelDados.listaProdutora.add(obj);
        }
        return true;
    }

    public boolean remover(ModelProdutora obj) {
        ModelDados.listaProdutora.remove(obj);
        return true;
    }
}
