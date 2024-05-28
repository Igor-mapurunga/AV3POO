package Veiculos;

import Veiculos.Veiculo;

public abstract class Caminhao extends Veiculo {
    protected int capacidadeDeCarga;
    public Caminhao(String modelo, String marca, int capacidadeDeCarga) {
        super(modelo, marca);
        if (capacidadeDeCarga <= 0){
            throw new IllegalArgumentException("Capacidade de carga deve ser maior que zero");
        }
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    @Override
    public void exibirDetalhes() {

    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "capacidadeDeCarga=" + capacidadeDeCarga +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
