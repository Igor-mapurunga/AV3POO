package Veiculos;

import Interfaces.OperacoesAluguel;
import Interfaces.OperacoesManutencao;
import Interfaces.OperacoesVeiculo;

public class CaminhaoPequeno extends Caminhao implements OperacoesManutencao, OperacoesVeiculo, OperacoesAluguel {
    public CaminhaoPequeno(String modelo, String marca, int capacidadeDeCarga) {
        super(modelo, marca, capacidadeDeCarga);
    }
    @Override
    public void exibirDetalhes() {
        System.out.println("Caminhão Pequeno: Modelo - " +
                modelo +
                ", Marca - " +
                marca +
                ", Capacidade de Carga - "
                + capacidadeDeCarga);
    }

    @Override
    public void ligar() {
        System.out.println("Carro ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Carro desligado");
    }

    @Override
    public void alugar() {
        System.out.println("Carro alugado");
    }

    @Override
    public void devolver() {
        System.out.println("Carro devolvido");
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção iniciada");
    }

    @Override
    public void finalizarManutencao() {
        System.out.println("Manutenção finalizada");
    }

    @Override
    public String toString() {
        return "CaminhaoPequeno{" +
                "capacidadeDeCarga=" + capacidadeDeCarga +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}