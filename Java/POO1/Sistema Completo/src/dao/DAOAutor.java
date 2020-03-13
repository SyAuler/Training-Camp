package dao;

import model.ModelAutor;
import model.ModelDados;
import java.util.List;

public class DAOAutor {

    public List<ModelAutor> getLista() {
        return ModelDados.listaAutor;
    }

    public boolean salvar(ModelAutor obj) {

        if (obj.getCodigo() == null) {
            Integer codigo = ModelDados.listaAutor.size() + 1;
            obj.setCodigo(codigo);
            ModelDados.listaAutor.add(obj);
        }
        return true;
    }

    public boolean remover(ModelAutor obj) {
        ModelDados.listaAutor.remove(obj);
        return true;
    }
}
