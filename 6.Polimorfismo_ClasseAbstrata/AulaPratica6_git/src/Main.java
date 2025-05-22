//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal vaca = new Vaca("Josefina");
        Animal papagaio = new Papagaio("Louro José");

        vaca.emitirSom();
        papagaio.emitirSom();

        // Demonstrando a SOBRECARGA de emitirSom()
        Papagaio papagaioFalante = new Papagaio("Louro Falante");
        papagaioFalante.emitirSom(); // Curupaco!
        papagaioFalante.emitirSom("Olá, crianças!"); // Frase personalizada

        //Testando Gato
        Gato gato = new Gato("Luke");
        gato.mover();
    }
}