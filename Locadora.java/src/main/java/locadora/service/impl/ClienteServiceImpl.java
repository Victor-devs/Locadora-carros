package locadora.service.impl;

import locadora.model.Cliente;
import locadora.service.ClienteService;

import java.util.ArrayList;
import java.util.List;

public class ClienteServiceImpl implements ClienteService {
    private List<Cliente> clientes = new ArrayList<>();

    @Override
    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public void alterarCliente(Cliente cliente) {
    }
}

