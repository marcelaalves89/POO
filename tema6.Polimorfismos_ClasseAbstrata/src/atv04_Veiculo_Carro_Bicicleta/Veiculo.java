package atv04_Veiculo_Carro_Bicicleta;

abstract class Veiculo {

    String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public abstract void mover();
}
