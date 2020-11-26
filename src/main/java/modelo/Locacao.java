package modelo;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Locacao implements EntidadeBase {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "idInquilino", nullable = true)
    private Clientes cliente;

    @ManyToOne
    @JoinColumn(name = "idImovel", nullable = true)
    private Imoveis imovel;

    private double valorAluguel;
    private double percentualMulta;
    private int diaVencimento;
    private String dataInicio;
    private String dataFim;
    private boolean ativo;
    private String obs;

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Imoveis getImovel() {
        return imovel;
    }

    public void setImovel(Imoveis imovel) {
        this.imovel = imovel;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public double getPercentualMulta() {
        return percentualMulta;
    }

    public void setPercentualMulta(double percentualMulta) {
        this.percentualMulta = percentualMulta;
    }

    public int getDiaVencimento() {
        return diaVencimento;
    }

    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public void getLocacao (Locacao a){
        System.out.println(" Id Locacao: " + a.getId());
        System.out.println(" Id Cliente: " + a.getCliente().getId());
        System.out.println(" Id Imovel: " + a.getImovel().getId());
        System.out.println(" Valor Aluguel: R$ " + a.getValorAluguel());
        System.out.println(" Percentual Multa: " + a.getPercentualMulta() + "%");
        System.out.println(" Dia Vencimento: " + a.getDiaVencimento());
        System.out.println(" Data Inicio: " + a.getDataInicio());
        System.out.println(" Data Fim: " + a.getDataFim());
        System.out.println(" Ativo: " + a.isAtivo());
        System.out.println(" Observação: " + a.getObs() + "\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Locacao)) return false;
        Locacao locacao = (Locacao) o;
        return id == locacao.id &&
                Double.compare(locacao.valorAluguel, valorAluguel) == 0 &&
                Double.compare(locacao.percentualMulta, percentualMulta) == 0 &&
                diaVencimento == locacao.diaVencimento &&
                ativo == locacao.ativo &&
                cliente.equals(locacao.cliente) &&
                imovel.equals(locacao.imovel) &&
                dataInicio.equals(locacao.dataInicio) &&
                dataFim.equals(locacao.dataFim) &&
                obs.equals(locacao.obs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cliente, imovel, valorAluguel, percentualMulta, diaVencimento, dataInicio, dataFim, ativo, obs);
    }
}
