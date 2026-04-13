package atv04_Veiculo_Carro_Bicicleta;

public class Main {

    public static void main(String[] args) {

        Veiculo v1 = new Carro("Fusca");
        Veiculo v2 = new Bicicleta("Caloi");

        System.out.println("Modelo: " + v1.modelo);
        v1.mover();

        System.out.println("Modelo: " + v2.modelo);
        v2.mover();
    }
}
