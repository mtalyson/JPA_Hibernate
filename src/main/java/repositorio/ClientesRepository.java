package repositorio;

import modelo.Clientes;

import javax.persistence.EntityManager;
import java.util.List;

public class ClientesRepository {

    private final EntityManager manager;
    private DAOGenerico<Clientes> daoGenerico;

    public ClientesRepository(EntityManager manager) {
        this.manager = manager;
        daoGenerico = new DAOGenerico<>(manager);
    }

    public void inserir(Clientes cliente){
        daoGenerico.inserir(cliente);
    }

    public Clientes buscaPorId(int id){
        return daoGenerico.buscaPorId(Clientes.class, id);
    }

    public List<Clientes> listarTodos(){
        return daoGenerico.listarTodos(Clientes.class);
    }

    public Clientes atualiza(int id){
        return daoGenerico.atualiza(Clientes.class, id);
    }

    public void salva(Clientes cliente){
        daoGenerico.salva(cliente);
    }

    public void deletarPorId(int id){
        daoGenerico.deletaPorId(Clientes.class, id);
    }
}
