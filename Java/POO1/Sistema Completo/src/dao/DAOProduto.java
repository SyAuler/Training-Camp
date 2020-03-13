package dao;

import model.ModelDados;
import model.ModelProduto;
import java.util.List;

public class DAOProduto {
    
    ModelProduto modelProduto = new ModelProduto();
    
    ModelDados modelDados = new ModelDados();
    
    public List<ModelProduto> getLista() {
        return ModelDados.listaProduto;
    }

    public ModelProduto getListaCod(int codigo) {
        return ModelDados.listaProduto.get(codigo);
    }
    public boolean salvar(ModelProduto obj) {

        if (obj.getCodigo() == null) {
            Integer codigo = ModelDados.listaProduto.size() + 1;
            obj.setCodigo(codigo);
            ModelDados.listaProduto.add(obj);
        }
        return true;
    }

    public boolean remover(ModelProduto obj) {
        ModelDados.listaProduto.remove(obj);
        return true;
    }
}
