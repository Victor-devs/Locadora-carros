package locadora.service;

import locadora.model.Aluguel;

public interface AluguelService {

    void alugarVeiculo(Aluguel aluguel);

    void devolverVeiculo(Aluguel aluguel);
}
