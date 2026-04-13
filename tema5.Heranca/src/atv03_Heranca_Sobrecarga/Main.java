package atv03_Heranca_Sobrecarga;

public class Main {

    public static void main(String[] args) {

        Gato gato = new Gato("Mimi", 2, "Branca");
        Cachorro cachorro = new Cachorro("Rex", 5, "Grande");

        // Testando métodos emitirSom (sobrecarga)
        gato.emitirSom();
        gato.emitirSom("Miau");

        cachorro.emitirSom();
        cachorro.emitirSom("Au Au");

        // Testando métodos brincar (sobrecarga)
        gato.brincar();
        gato.brincar("novelo de lã");

        // Testando métodos correr (sobrecarga)
        cachorro.correr();
        cachorro.correr(100);
    }
}
