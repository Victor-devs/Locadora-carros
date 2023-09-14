package locadora.model;

import locadora.model.Cliente;

public class ClientePessoaJuridica extends Cliente {
    private String cnpj;
    private String empresa;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "ClientePessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                ", empresa='" + empresa + '\'' +
                '}';
    }
}
