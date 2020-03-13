package dao;

import model.ModelCliente;
import model.ModelDados;
import java.util.List;

public class DAOCliente { //classe que vai gravar em memória
    
    ModelCliente modelCliente = new ModelCliente();
    ModelDados modelDados = new ModelDados();
       
    public List<ModelCliente> getLista()    {
        return ModelDados.listaCliente;
    }
    
    public boolean salvar(ModelCliente obj){
        if (obj.getCodigo() == null){
            Integer codigo = ModelDados.listaCliente.size() + 1;
            obj.setCodigo(codigo);
            ModelDados.listaCliente.add(obj);
        }
        return true;
    }
    
    public boolean remover(ModelCliente obj){
        ModelDados.listaCliente.remove(obj);
        return true;
    }  
    
    public void getClienteDAO(int pCodigo){
        this.modelCliente.setCodigo(pCodigo);
    }
}
