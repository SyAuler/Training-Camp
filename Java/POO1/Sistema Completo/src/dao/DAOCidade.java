
package dao;

import model.ModelCidade;
import model.ModelDados;
import java.util.List;

public class DAOCidade {
    
    public List<ModelCidade> getLista(){
        return ModelDados.listaCidade;
    }
    
    public boolean salvar(ModelCidade obj){
        
        if (obj.getCodigo() == null){
            Integer codigo = ModelDados.listaCidade.size() + 1;
            obj.setCodigo(codigo);
            ModelDados.listaCidade.add(obj);
        }
        return true;
    }
    
    public boolean remover(ModelCidade obj){
        ModelDados.listaCidade.remove(obj);
        return true;
    }
    
}
