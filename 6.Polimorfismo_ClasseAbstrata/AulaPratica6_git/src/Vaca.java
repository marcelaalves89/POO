public class Vaca extends Animal {
    //defina atributos específico Aqui

    public Vaca(String nome){
        super(nome);
    }
    @Override
    public void emitirSom() {
        System.out.println("Muuu");
    }
    @Override
    public void mover() {
        System.out.println("Andando pelo pasto.");
    }
}

