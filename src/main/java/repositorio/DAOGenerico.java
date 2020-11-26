package repositorio;

import modelo.EntidadeBase;
import javax.persistence.EntityManager;
import java.util.List;

class DAOGenerico<T extends EntidadeBase> {

    EntityManager manager;

    DAOGenerico(EntityManager manager) {
        this.manager = manager;
    }

    void inserir(T t) {
        manager.getTransaction().begin();
        manager.persist(t);
        manager.getTransaction().commit();
    }

    T buscaPorId(Class<T> clazz, int id) {
        return manager.find(clazz, id);
    }

    public List<T> listarTodos(Class<T> clazz){
        return manager.createQuery( "Select a from " + clazz.getName() + " a")
                .getResultList();
    }

    void salva(T t){
        manager.persist(t);
    }

    T atualiza(Class<T> clazz, int id){
        return buscaPorId(clazz, id);
    }

    public void deletaPorId(Class<T> clazz, int id){
        manager.getTransaction().begin();
        T t = buscaPorId(clazz, id);
        manager.remove(t);
        manager.getTransaction().commit();
    }
}