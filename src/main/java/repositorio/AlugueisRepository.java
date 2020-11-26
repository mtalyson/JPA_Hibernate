package repositorio;

import modelo.Alugueis;

import javax.persistence.EntityManager;
import java.util.List;

public class AlugueisRepository {

    private final EntityManager manager;
    private DAOGenerico<Alugueis> daoGenerico;

    public AlugueisRepository(EntityManager manager) {
        this.manager = manager;
        daoGenerico = new DAOGenerico<>(manager);
    }

    public void inserir(Alugueis aluguel){
        daoGenerico.inserir(aluguel);
    }

    public List<Alugueis> listarTodos(){
        return daoGenerico.listarTodos(Alugueis.class);
    }

    public Alugueis atualiza(int id){
        return daoGenerico.atualiza(Alugueis.class, id);
    }

    public void salva(Alugueis aluguel){
        daoGenerico.salva(aluguel);
    }

    public void deletarPorId(int id){
        daoGenerico.deletaPorId(Alugueis.class, id);
    }
}
