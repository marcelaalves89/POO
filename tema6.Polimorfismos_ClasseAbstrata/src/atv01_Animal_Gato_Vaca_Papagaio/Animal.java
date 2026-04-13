package atv01_Animal_Gato_Vaca_Papagaio;

public abstract class Animal {

    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    // metodo abstrato
    public abstract void emitirSom();

    // metodo abstrato
    public abstract void mover();
}

