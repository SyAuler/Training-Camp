package dao;

import model.ModelCategProduto;
import model.ModelDados;
import java.util.List;

public class DAOCategProduto {
    
    ModelDados modelDados = new ModelDados();
    
    public List<ModelCategProduto> getLista() {
        return ModelDados.listaCategoriaProd;
    }

    public boolean salvar(ModelCategProduto obj) {

        if (obj.getCodigo() == null) {
            Integer codigo = ModelDados.listaCategoriaProd.size() + 1;
            obj.setCodigo(codigo);
            ModelDados.listaCategoriaProd.add(obj);
        }
        return true;
    }

    public boolean remover(ModelCategProduto obj) {
        ModelDados.listaCategoriaProd.remove(obj);
        return true;
    }
}
