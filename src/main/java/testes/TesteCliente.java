package testes;

import modelo.Clientes;
import repositorio.ClientesRepository;
import util.JPAUtil;

import javax.persistence.EntityManager;

public class TesteCliente {

    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();

        Clientes clie = new Clientes();
        clie.setNomeCliente("Cliente 1");
        clie.setCpf(111111111);
        clie.setCelular("(11) 1111-111");
        clie.setEmail("cliente1@cliente.com");
        clie.setDataNascimento("11/11/1991");

        //Inserindo Cliente no Banco
        ClientesRepository repo_clie = new ClientesRepository(em);
        repo_clie.inserir(clie);

        em.close();

    }
}
