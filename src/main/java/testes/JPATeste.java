package testes;

import modelo.Alugueis;
import modelo.Locacao;
import util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class JPATeste {

    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();

        //Listar todas as locações agrupadas por cliente
        Query q1 = em.createQuery("Select a from Locacao a group by idInquilino");
        List<Locacao> locacao = q1.getResultList();

        System.out.println("\n\n########### Locações Agrupadas por Cliente ###########\n");
        for (Locacao a: locacao){
            a.getLocacao(a);
        }

        //Listar todos os alugueis de um determinado inquilino
        Locacao loca = new Locacao();
        Query q2 = em.createNativeQuery("Select * from Alugueis join Locacao on Alugueis.idLocacao = Locacao.id where Locacao.idInquilino = ?", Alugueis.class)
                .setParameter(1, 2);
        List<Alugueis> aluguel = q2.getResultList();

        System.out.println("\n\n########### Todos os Alugueis de um Determinado Inquilino ###########\n");
        if(aluguel.isEmpty()){
            System.out.println(" >> O inquilino não possui nenhum aluguel ou seu ID está incorreto");
        }
        else{
            for(Alugueis b: aluguel){
                b.getAlugueis(b);
            }
        }

        em.close();
    }
}
