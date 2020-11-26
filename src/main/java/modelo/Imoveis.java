package modelo;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Imoveis implements EntidadeBase {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    private String tipoImovel;
    private String endereco;
    private String bairro;
    private int cep;
    private double metragem;
    private int dormitorios;
    private int banheiros;
    private int suites;
    private int vagasGaragem;
    private double valorAluguelSugerido;
    private String obs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(String tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public double getMetragem() {
        return metragem;
    }

    public void setMetragem(double metragem) {
        this.metragem = metragem;
    }

    public int getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(int dormitorios) {
        this.dormitorios = dormitorios;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    public int getSuites() {
        return suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    public int getVagasGaragem() {
        return vagasGaragem;
    }

    public void setVagasGaragem(int vagasGaragem) {
        this.vagasGaragem = vagasGaragem;
    }

    public double getValorAluguelSugerido() {
        return valorAluguelSugerido;
    }

    public void setValorAluguelSugerido(double valorAluguelSugerido) {
        this.valorAluguelSugerido = valorAluguelSugerido;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public void getImoveis(Imoveis a){
        System.out.println(" Id Imovel: " + a.getId());
        System.out.println(" Tipo Imovel: " + a.getTipoImovel());
        System.out.println(" Endereco: " + a.getEndereco());
        System.out.println(" Bairro: " + a.getBairro());
        System.out.println(" CEP: " + a.getCep());
        System.out.println(" Metragem: " + a.getMetragem());
        System.out.println(" Qtd Dormitorios: " + a.getDormitorios());
        System.out.println(" Qtd Banheiros: " + a.getBanheiros());
        System.out.println(" Qtd Suites: " + a.getSuites());
        System.out.println(" Valor Aluguel Sugerido: " + a.getValorAluguelSugerido());
        System.out.println(" Observação: " + a.getObs() + "\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Imoveis)) return false;
        Imoveis imoveis = (Imoveis) o;
        return id == imoveis.id &&
                cep == imoveis.cep &&
                Double.compare(imoveis.metragem, metragem) == 0 &&
                dormitorios == imoveis.dormitorios &&
                banheiros == imoveis.banheiros &&
                suites == imoveis.suites &&
                vagasGaragem == imoveis.vagasGaragem &&
                Double.compare(imoveis.valorAluguelSugerido, valorAluguelSugerido) == 0 &&
                tipoImovel.equals(imoveis.tipoImovel) &&
                endereco.equals(imoveis.endereco) &&
                bairro.equals(imoveis.bairro) &&
                obs.equals(imoveis.obs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tipoImovel, endereco, bairro, cep, metragem, dormitorios, banheiros, suites, vagasGaragem, valorAluguelSugerido, obs);
    }
}
