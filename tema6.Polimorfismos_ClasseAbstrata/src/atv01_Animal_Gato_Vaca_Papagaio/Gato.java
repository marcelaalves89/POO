package atv01_Animal_Gato_Vaca_Papagaio;

public class Gato extends Animal {

    private String raca;

    public Gato(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }
    //implementar set e get

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Miau!");
    }

    @Override
    public void mover() {
        System.out.println(nome + " está saltando agilmente.");
    }
}

