package Main;
import Veiculos.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        List<Veiculo> veiculosDisponiveis = new ArrayList<>();
        List<Veiculo> veiculosAlugados = new ArrayList<>();

        Veiculo sedan = new Sedan("Corolla", "Toyota", 4);
        Veiculo suv = new SUV("SW4", "Toyota", 4);
        Veiculo caminhaoPequeno = new CaminhaoPequeno("HR", "Hyundai", 2000);
        Veiculo caminhaoGrande = new CaminhaoGrande("FH-540", "Volvo", 2000);

        veiculosDisponiveis.add(sedan);
        veiculosDisponiveis.add(suv);
        veiculosDisponiveis.add(caminhaoGrande);
        veiculosDisponiveis.add(caminhaoPequeno);

        while (opcao != 9) {
            System.out.println("Bem-vindo à Locadora de Carros!");
            System.out.println("Selecione uma opção:");
            System.out.println("1. Exibir veículos disponíveis");
            System.out.println("2. Alugar um veículo");
            System.out.println("3. Devolver um veículo");
            System.out.println("4. Exibir veículos alugados");
            System.out.println("9. Sair");
            System.out.print("Opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Veiculo.exibirDetalhesVeiculos(veiculosDisponiveis);
                    break;
                case 2:
                    Veiculo.alugaCarro(veiculosDisponiveis, veiculosAlugados);
                    break;
                case 3:
                    Veiculo.devolverCarro(veiculosAlugados, veiculosDisponiveis);
                    break;
                case 4:
                    Veiculo.exibirVeiculosAlugados(veiculosAlugados);
                    break;
                case 9:
                    System.out.println("Obrigado por usar nossa Locadora de Carros!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
            if (opcao != 9) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        scanner.close();
    }
}
