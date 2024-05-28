package Veiculos;

import Interfaces.OperacoesAluguel;
import Interfaces.OperacoesManutencao;
import Interfaces.OperacoesVeiculo;

public class CaminhaoGrande extends Caminhao implements OperacoesManutencao, OperacoesAluguel, OperacoesVeiculo {
    public CaminhaoGrande(String modelo, String marca, int capacidadeDeCarga) {
        super(modelo, marca, capacidadeDeCarga);
    }
    @Override
    public void exibirDetalhes() {
        System.out.println("Caminhão Grande: Modelo - " +
                modelo +
                ", Marca - " +
                marca +
                ", Capacidade de Carga - "
                + capacidadeDeCarga);
    }

    public void exibirDetalhes(boolean exibirCapacidadeDeCarga) {
        if (exibirCapacidadeDeCarga) {
            System.out.println("Caminhão Grande: Modelo - " +
                    modelo +
                    ", Marca - " +
                    marca +
                    ", Capacidade de Carga - "
                    + capacidadeDeCarga);
        } else {
            System.out.println("Caminhão Grande: Modelo - " + modelo + ", Marca - " + marca);
        }
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
        return "CaminhaoGrande{" +
                "capacidadeDeCarga=" + capacidadeDeCarga +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}