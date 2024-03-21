package TestClass;

import Class.Veiculo;
import Class.Carro;
import Class.Caminhao;

public class TestVeiculo {
    public static void main(String[] args) {

        Veiculo carro = new Carro();
        Veiculo caminhao = new Caminhao();

        carro.acelerar();
        carro.frear();

        caminhao.acelerar();
        caminhao.frear();
    }
}