package atv01_Associacao_CarroPessoa;

public class Carro {
    private String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public void dirigir() {
        System.out.println("Dirigindo o carro modelo " + modelo);
    }
}
