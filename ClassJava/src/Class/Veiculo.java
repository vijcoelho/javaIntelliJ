package Class;

public interface Veiculo {
    void acelerar();
    void frear();
}

abstract class VeiculoBase implements Veiculo {
    public void acelerar() {
        System.out.println("Esta acelerando...");
    }

    public abstract void frear();
}

