public class Gato extends Animal {
    //defina atributos específico Aqui

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    @Override
    public void mover() {
        System.out.println(super.nome+" se move saltando agilmente.");
    }
}
