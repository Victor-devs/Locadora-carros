package locadora.model;

import locadora.model.Cliente;

public class ClientePessoaFisica extends Cliente {
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "ClientePessoaFisica{" +
                "cpf='" + cpf + '\'' +
                '}';
    }

}
