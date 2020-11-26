package testes;

import modelo.Clientes;
import modelo.Imoveis;
import modelo.Locacao;
import repositorio.ClientesRepository;
import repositorio.ImoveisRepository;
import repositorio.LocacaoRepository;
import util.JPAUtil;

import javax.persistence.EntityManager;

public class TesteLocacao {

    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();
        ClientesRepository repo_clie = new ClientesRepository(em);
        ImoveisRepository repo_imvl = new ImoveisRepository(em);
        LocacaoRepository repo_loca = new LocacaoRepository(em);

        Clientes clie = new Clientes();
        clie.setNomeCliente("Cliente 2");
        clie.setCpf(222222222);
        clie.setCelular("(22) 2222-222");
        clie.setEmail("cliente2@cliente.com");
        clie.setDataNascimento("22/22/1992");

        //Inserindo Cliente no Banco
        repo_clie.inserir(clie);

        Imoveis imvl = new Imoveis();
        imvl.setTipoImovel("Tipo2");
        imvl.setEndereco("Endereco2");
        imvl.setBairro("Bairro2");
        imvl.setCep(222222);
        imvl.setMetragem(222.22);
        imvl.setDormitorios(2);
        imvl.setBanheiros(2);
        imvl.setSuites(2);
        imvl.setVagasGaragem(2);
        imvl.setValorAluguelSugerido(2222.22);
        imvl.setObs("Observação2");

        //Inserindo Imovel no Banco
        repo_imvl.inserir(imvl);

        Locacao loca = new Locacao();
        loca.setCliente(clie);
        loca.setImovel(imvl);
        loca.setValorAluguel(2222.22);
        loca.setPercentualMulta(0.75);
        loca.setDiaVencimento(30);
        loca.setDataInicio("11/11/2011");
        loca.setDataFim("11/11/2021");
        loca.setAtivo(true);
        loca.setObs("Observação1");

        //Inserindo Locacao no Banco
        repo_loca.inserir(loca);

        //Atualizando Locacao
        /*em.getTransaction().begin();
        Locacao locacao = repo_loca.atualiza(1);
        locacao.setDiaVencimento(25);
        em.getTransaction().commit();*/

        //Excluindo Locação
        //repo_loca.deletarPorId(1);

        em.close();
    }
}
