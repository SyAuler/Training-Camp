package dao;

import model.ModelDados;
import model.ModelFilme;
import java.util.List;

public class DAOFilme {
    
    ModelDados modelDados = new ModelDados();
    
    public List<ModelFilme> getLista() {
        return ModelDados.listaFilme;
    }
    
    public ModelFilme getListaCod(int codigo) {
        return ModelDados.listaFilme.get(codigo);
    }

    public boolean salvar(ModelFilme obj) {

        if (obj.getCodigo() == null) {
            Integer codigo = ModelDados.listaFilme.size() + 1;
            obj.setCodigo(codigo);
            ModelDados.listaFilme.add(obj);
        }
        return true;
    }

    public boolean remover(ModelFilme obj) {
        ModelDados.listaFilme.remove(obj);
        return true;
    }
}
