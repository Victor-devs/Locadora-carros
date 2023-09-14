package locadora.service.impl;

import locadora.model.Aluguel;
import locadora.service.AluguelService;

import java.util.ArrayList;
import java.util.List;

public class AluguelServiceImpl implements AluguelService {
    private List<Aluguel> alugueis = new ArrayList<>();

    @Override
    public void alugarVeiculo(Aluguel aluguel) {
        alugueis.add(aluguel);
    }

    @Override
    public void devolverVeiculo(Aluguel aluguel) {
    }
}
