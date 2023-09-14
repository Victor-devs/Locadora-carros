package locadora.model;

import locadora.service.VeiculoService;

import java.time.LocalDateTime;
import java.util.Objects;

public class Aluguel <T extends VeiculoService> {
    private long id;
    private T veiculo;
    private Cliente cliente;
    private LocalDateTime dataHoraAluguel;
    private LocalDateTime dataHoraDevolucao;

    public void alugarVeiculo(T veiculo, Cliente cliente) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.dataHoraAluguel = LocalDateTime.now();

    }
        public void devolverVeiculo() {
            this.dataHoraDevolucao = LocalDateTime.now();
        }

    public T getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(T veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getDataHoraAluguel() {
        return dataHoraAluguel;
    }

    public void setDataHoraAluguel(LocalDateTime dataHoraAluguel) {
        this.dataHoraAluguel = dataHoraAluguel;
    }

    public LocalDateTime getDataHoraDevolucao() {
        return dataHoraDevolucao;
    }

    public void setDataHoraDevolucao(LocalDateTime dataHoraDevolucao) {
        this.dataHoraDevolucao = dataHoraDevolucao;
    }

    @Override
    public String toString() {
        return "Aluguel{" +
                "id=" + id +
                ", veiculo=" + veiculo +
                ", cliente=" + cliente +
                ", dataHoraAluguel=" + dataHoraAluguel +
                ", dataHoraDevolucao=" + dataHoraDevolucao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluguel<?> aluguel = (Aluguel<?>) o;
        return id == aluguel.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
