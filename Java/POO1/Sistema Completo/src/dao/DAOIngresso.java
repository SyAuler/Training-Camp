
package dao;

import model.ModelDados;
import java.util.List;
import model.ModelIngresso;

public class DAOIngresso { //classe que vai gravar em memória
    
    ModelIngresso modelIngresso = new ModelIngresso();
    ModelDados modelDados = new ModelDados();
    
    public List<ModelIngresso> getLista()    {
        return ModelDados.listaIngressos;
    }
    
    public boolean salvar(ModelIngresso obj){
        if (obj.getCodigo() == null){
            Integer codigo = ModelDados.listaIngressos.size() + 1;
            obj.setCodigo(codigo);
            ModelDados.listaIngressos.add(obj);
        }
        return true;
    }
    
    public boolean remover(ModelIngresso obj){
        ModelDados.listaIngressos.remove(obj);
        return true;
    }  

}
