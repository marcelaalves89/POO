package atv01_Animal_Gato_Vaca_Papagaio;

public class Vaca extends Animal {

    private double peso;

    public Vaca(String nome, double peso) {
        super(nome);
        this.peso = peso;
    }

    //implementar set e get

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Muuu!");
    }

    @Override
    public void mover() {
        System.out.println(nome + " está andando pelo pasto.");
    }
}

