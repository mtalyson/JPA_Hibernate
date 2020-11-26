package modelo;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Alugueis implements EntidadeBase {

    @Id
    private int dataVencimento;

    @ManyToOne
    @JoinColumn(name = "idLocacao", nullable = false)
    private Locacao locacao;

    private double valorPago;
    private String dataPagamento;
    private String obs;

    @Override
    public int getId() {
        return dataVencimento;
    }

    public void setDataVencimento(int dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Locacao getLocacao() {
        return locacao;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public void getAlugueis(Alugueis a){
        System.out.println(" Id Aluguel: " + a.getId());
        System.out.println(" Id Locacao: " + a.getLocacao().getId());
        System.out.println(" Id Imovel: " + a.getValorPago());
        System.out.println( "Id Inquilino: " + a.getLocacao().getCliente().getId());
        System.out.println(" Valor Aluguel: R$ " + a.getDataPagamento());
        System.out.println(" Observação: " + a.getObs() + "\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alugueis)) return false;
        Alugueis alugueis = (Alugueis) o;
        return dataVencimento == alugueis.dataVencimento &&
                Double.compare(alugueis.valorPago, valorPago) == 0 &&
                locacao.equals(alugueis.locacao) &&
                dataPagamento.equals(alugueis.dataPagamento) &&
                obs.equals(alugueis.obs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataVencimento, locacao, valorPago, dataPagamento, obs);
    }
}
