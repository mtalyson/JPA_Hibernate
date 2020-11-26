package testes;

import modelo.Imoveis;
import repositorio.ImoveisRepository;
import util.JPAUtil;

import javax.persistence.EntityManager;

public class TesteImoveis {

    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();
        ImoveisRepository repo_imvl = new ImoveisRepository(em);

        Imoveis imvl = new Imoveis();
        imvl.setTipoImovel("Tipo1");
        imvl.setEndereco("Endereco1");
        imvl.setBairro("Bairro1");
        imvl.setCep(111111);
        imvl.setMetragem(102.34);
        imvl.setDormitorios(2);
        imvl.setBanheiros(2);
        imvl.setSuites(1);
        imvl.setVagasGaragem(2);
        imvl.setValorAluguelSugerido(575.25);
        imvl.setObs("Observação1");

        //Inserindo Imovel no Banco (DESCOMENTE PARA TESTAR)

        repo_imvl.inserir(imvl);

        //Listar Todos os Imoveis Cadastrados (DESCOMENTE PARA TESTAR)

        /*List<Imoveis> imoveis = repo_imvl.listarTodos();

        System.out.println("\n\n########### IMOVEIS CADASTRADOS ###########\n");
        for(Imoveis a: imoveis){
            a.getImoveis(a);
        }*/

        //Atualizando Imovel (DESCOMENTE PARA TESTAR)

        /*em.getTransaction().begin();
        Imoveis imovel = repo_imvl.atualiza(1);
        imovel.setTipoImovel("Tipo 4");
        em.getTransaction().commit();*/


        //Removendo Imovel do Banco (DESCOMENTE PARA TESTAR)

        //repo_imvl.deletarPorId(2);

        em.close();

    }
}
