package atv04_Veiculo_Carro_Bicicleta;

class Bicicleta extends Veiculo {

    public Bicicleta(String modelo) {
        super(modelo);
    }

    @Override
    public void mover() {
        System.out.println("A bicicleta está se movendo com pedal.");
    }
}
