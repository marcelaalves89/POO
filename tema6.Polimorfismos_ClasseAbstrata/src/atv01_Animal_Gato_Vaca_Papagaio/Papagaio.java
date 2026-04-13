package atv01_Animal_Gato_Vaca_Papagaio;

public class Papagaio extends Animal {

    private String cor;

    public Papagaio(String nome, String cor) {
        super(nome);
        this.cor = cor;
    }

    //implementar set e get

    // sobrescrita (override)
    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Curupaco!");
    }

    // sobrecarga (overload)
    public void emitirSom(String frase) {
        System.out.println(nome + " repete: " + frase);
    }

    @Override
    public void mover() {
        System.out.println(nome + " está voando pelos céus.");
    }
}
