package repositorio;

import modelo.Locacao;

import javax.persistence.EntityManager;
import java.util.List;

public class LocacaoRepository {

    private final EntityManager manager;
    private DAOGenerico<Locacao> daoGenerico;

    public LocacaoRepository(EntityManager manager) {
        this.manager = manager;
        daoGenerico = new DAOGenerico<>(manager);
    }

    public void inserir(Locacao locacao){
        daoGenerico.inserir(locacao);
    }

    public Locacao buscaPorId(int id){
        return daoGenerico.buscaPorId(Locacao.class, id);
    }

    public List<Locacao> listarTodos(){
        return daoGenerico.listarTodos(Locacao.class);
    }

    public Locacao atualiza(int id){
        return daoGenerico.atualiza(Locacao.class, id);
    }

    public void salva(Locacao locacao){
        daoGenerico.salva(locacao);
    }

    public void deletarPorId(int id){
        daoGenerico.deletaPorId(Locacao.class, id);
    }
}
