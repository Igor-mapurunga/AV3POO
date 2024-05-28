package Veiculos;

import Interfaces.OperacoesAluguel;
import Interfaces.OperacoesManutencao;
import Interfaces.OperacoesVeiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public abstract class Veiculo implements OperacoesVeiculo, OperacoesAluguel, OperacoesManutencao {
    protected String modelo;
    protected String marca;

    public java.lang.String getModelo() {
        return modelo;
    }

    public void setModelo(java.lang.String modelo) {
        this.modelo = modelo;
    }

    public java.lang.String getMarca() {
        return marca;
    }

    public void setMarca(java.lang.String marca) {
        this.marca = marca;
    }

    public Veiculo(String modelo, String marca) {
        if(modelo == null || marca == null) {
            throw new IllegalArgumentException("Modelo e Marca não podem ser nulos");
        }
        this.modelo = modelo;
        this.marca = marca;
    }

    public void realizarManutencao(){
        System.out.println("Manutenção iniciada");
    }

    public void finalizarManutencao(){
        System.out.println("Manutenção finalizada");
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
    public abstract void exibirDetalhes();

    public static void exibirDetalhesVeiculos(List<Veiculo> veiculos){
        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDetalhes();
        }
    }

    public static void alugaCarro(List<Veiculo> veiculosDisponiveis,List<Veiculo> veiculosAlugados){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o índice do veículo que você deseja alugar, sabendo que a lista começa da posição 0: ");
        int indiceDoVeiculo = scanner.nextInt();

        if (indiceDoVeiculo >= 0 && indiceDoVeiculo < veiculosDisponiveis.size()){;
            Veiculo veiculoSelecionado = veiculosDisponiveis.remove(indiceDoVeiculo);
            veiculosAlugados.add(veiculoSelecionado);
            System.out.println("Veiculo alugado com sucesso");
        }else {
            System.out.println("Índice inválido ou veículo não disponível.");
        }
    }

    public static void devolverCarro(List<Veiculo> veiculosAlugados, List<Veiculo> veiculosDisponiveis){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o índice do veículo que você deseja devolver: ");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < veiculosAlugados.size()) {
            Veiculo veiculoParaDevolver = veiculosAlugados.remove(indice);
            veiculosDisponiveis.add(veiculoParaDevolver);
            System.out.println("veiculo devolvido com sucesso!");
        } else {
            System.out.println("Índice inválido.");
        }
    }
    public static void exibirVeiculosAlugados(List<Veiculo> veiculosAlugados){
        for (Veiculo veiculo : veiculosAlugados) {
            veiculo.exibirDetalhes();
        }
    }
}


