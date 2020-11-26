package testes;

import modelo.Alugueis;
import repositorio.AlugueisRepository;
import repositorio.LocacaoRepository;
import util.JPAUtil;

import javax.persistence.EntityManager;

public class TesteAlugueis {

    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();

        LocacaoRepository repo_loca = new LocacaoRepository(em);
        AlugueisRepository repo_alug = new AlugueisRepository(em);

        Alugueis alug = new Alugueis();
        alug.setDataVencimento(30);
        alug.setLocacao(repo_loca.buscaPorId(1));
        alug.setValorPago(2222.22);
        alug.setDataPagamento("30/11/2020");
        alug.setObs("Aluguel_1");

        //Inserindo Alugueis no Banco (DESCOMENTE PARA TESTAR)
        //repo_alug.inserir(alug);

        //Removendo Alugueis do Banco (DESCOMENTE PARA TESTAR)
        //repo_alug.deletarPorId(30);

        em.close();
    }
}
