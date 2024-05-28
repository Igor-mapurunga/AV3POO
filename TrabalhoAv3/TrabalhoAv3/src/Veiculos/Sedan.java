package Veiculos;

import Interfaces.OperacoesAluguel;
import Interfaces.OperacoesManutencao;
import Interfaces.OperacoesVeiculo;

public class Sedan extends Carro implements OperacoesVeiculo, OperacoesAluguel, OperacoesManutencao {

    public Sedan(String modelo, String marca, int numeroDePortas) {
        super(modelo, marca, numeroDePortas);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Sedan Carro: Modelo - " +
                modelo +
                ", Marca - " +
                marca +
                ", Número de Portas - " +
                numeroDePortas);
    }

    public void exibirDetalhes(boolean exibirNumeroDePortas) {
        if (exibirNumeroDePortas) {
            System.out.println("Sedan Carro: Modelo - " + modelo + ", Marca - " + marca + ", Número de Portas - " + numeroDePortas);
        } else {
            System.out.println("Sedan Carro: Modelo - " + modelo + ", Marca - " + marca);
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
    public String toString() {
        return "Sedan{" +
                "numeroDePortas=" + numeroDePortas +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    @Override
    public void finalizarManutencao() {
        System.out.println("Manutenção finalizada");
    }
}
