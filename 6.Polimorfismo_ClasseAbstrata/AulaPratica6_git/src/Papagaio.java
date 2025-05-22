public class Papagaio extends Animal {
    //defina atributos específico Aqui

    public Papagaio(String nome){
        super(nome);
    }
    @Override
    public void emitirSom() {
        System.out.println("Curupaco!");
    }
    // Sobrecarga: metodo com o mesmo nome, mas com parâmetro agora
    public void emitirSom(String frase) {
        System.out.println(frase);
    }
    @Override
    public void mover() {
        System.out.println("Voando pelos céus!");
    }
}

