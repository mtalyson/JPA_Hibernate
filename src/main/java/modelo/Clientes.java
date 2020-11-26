package modelo;

import java.util.Objects;
import javax.persistence.*;

@Entity
public class Clientes implements EntidadeBase {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String nomeCliente;
    private int cpf;
    private String celular;
    private String email;
    private String dataNascimento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clientes)) return false;
        Clientes clientes = (Clientes) o;
        return id == clientes.id &&
                cpf == clientes.cpf &&
                nomeCliente.equals(clientes.nomeCliente) &&
                celular.equals(clientes.celular) &&
                email.equals(clientes.email) &&
                dataNascimento.equals(clientes.dataNascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomeCliente, cpf, celular, email, dataNascimento);
    }
}
