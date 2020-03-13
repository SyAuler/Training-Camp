package dao;

import java.util.List;
import model.ModelDados;
import model.ModelPacote;

public class DAOPacote {
        ModelPacote modelPacote = new ModelPacote();
    ModelDados modelDados = new ModelDados();
       
    public List<ModelPacote> getLista()    {
        return ModelDados.listaPacotes;
    }
    
    public boolean salvar(ModelPacote obj){
        if (obj.getCodigo() == null){
            Integer codigo = ModelDados.listaPacotes.size() + 1;
            obj.setCodigo(codigo);
            ModelDados.listaPacotes.add(obj);
        }
        return true;
    }
    
    public boolean remover(ModelPacote obj){
        ModelDados.listaPacotes.remove(obj);
        return true;
    }
}
