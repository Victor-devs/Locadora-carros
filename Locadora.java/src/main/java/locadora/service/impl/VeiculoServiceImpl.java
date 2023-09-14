package locadora.service.impl;

import locadora.model.Veiculo;
import locadora.service.VeiculoService;

import java.util.ArrayList;
import java.util.List;

public class VeiculoServiceImpl implements VeiculoService {

    private List<Veiculo> veiculos = new ArrayList<>();

    @Override
    public void cadastrarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    @Override
    public void alterarVeiculo(Veiculo veiculo) {
    }

    @Override
    public Veiculo buscarVeiculoPorNome(String nome) {
        return null;
    }
}

