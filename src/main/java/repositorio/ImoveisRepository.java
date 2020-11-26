package repositorio;

import modelo.Imoveis;

import javax.persistence.EntityManager;
import java.util.List;

public class ImoveisRepository {

    private final EntityManager manager;
    private DAOGenerico<Imoveis> daoGenerico;

    public ImoveisRepository(EntityManager manager) {
        this.manager = manager;
        daoGenerico = new DAOGenerico<>(manager);
    }

    public void inserir(Imoveis imovel){
        daoGenerico.inserir(imovel);
    }

    public Imoveis buscaPorId(int id){
        return daoGenerico.buscaPorId(Imoveis.class, id);
    }

    public List<Imoveis> listarTodos(){
        return daoGenerico.listarTodos(Imoveis.class);
    }

    public Imoveis atualiza(int id){
        return daoGenerico.atualiza(Imoveis.class, id);
    }

    public void salva(Imoveis imovel){
        daoGenerico.salva(imovel);
    }

    public void deletarPorId(int id){
        daoGenerico.deletaPorId(Imoveis.class, id);
    }
}
