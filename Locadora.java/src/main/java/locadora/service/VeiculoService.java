package locadora.service;

import locadora.model.Veiculo;

public interface VeiculoService {
    void cadastrarVeiculo(Veiculo veiculo);

    void alterarVeiculo(Veiculo veiculo);

    Veiculo buscarVeiculoPorNome(String nome);
}
