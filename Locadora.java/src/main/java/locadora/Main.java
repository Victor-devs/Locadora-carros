package locadora;

import locadora.model.Aluguel;
import locadora.model.Cliente;
import locadora.model.ClientePessoaFisica;
import locadora.model.Veiculo;
import locadora.service.AluguelService;
import locadora.service.ClienteService;
import locadora.service.VeiculoService;
import locadora.service.impl.AluguelServiceImpl;
import locadora.service.impl.ClienteServiceImpl;
import locadora.service.impl.VeiculoServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        VeiculoService veiculoService = new VeiculoServiceImpl();
        ClienteService clienteService = new ClienteServiceImpl();
        AluguelService aluguelService = new AluguelServiceImpl();

        do {
            System.out.println("1. Cadastrar veículo");
            System.out.println("2. Alterar veículo");
            System.out.println("3. Buscar veículo por nome");
            System.out.println("4. Cadastrar cliente");
            System.out.println("5. Alterar cliente");
            System.out.println("6. Alugar veículo");
            System.out.println("7. Devolver veículo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Veiculo novoVeiculo = new Veiculo();
                    veiculoService.cadastrarVeiculo(novoVeiculo);
                    break;
                case 2:
                    Veiculo veiculoParaAlterar = new Veiculo();
                    veiculoService.alterarVeiculo(veiculoParaAlterar);
                    break;
                case 3:
                    String nomeVeiculo = scanner.next();
                    Veiculo veiculoEncontrado = veiculoService.buscarVeiculoPorNome(nomeVeiculo);
                    System.out.println(veiculoEncontrado);
                    break;
                case 4:
                    Cliente novoCliente = new ClientePessoaFisica();
                    clienteService.cadastrarCliente(novoCliente);
                    break;
                case 5:
                    Cliente clienteParaAlterar = new ClientePessoaFisica();
                    clienteService.alterarCliente(clienteParaAlterar);
                    break;
                case 6:
                    Aluguel aluguel = new Aluguel();
                    aluguelService.alugarVeiculo(aluguel);
                    break;
                case 7:
                    Aluguel aluguelParaDevolver = new Aluguel();
                    aluguelService.devolverVeiculo(aluguelParaDevolver);
                    break;
            }
        } while (opcao != 0);
    }
}

