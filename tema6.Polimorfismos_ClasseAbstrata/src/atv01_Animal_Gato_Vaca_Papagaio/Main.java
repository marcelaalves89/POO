package atv01_Animal_Gato_Vaca_Papagaio;

public class Main {

    public static void main(String[] args) {

        Animal a1 = new Papagaio("Loro", "Verde");
        Animal a2 = new Vaca("Mimosa", 450.0);
        Animal a3 = new Gato("Mingau", "Siamês");

        Animal[] animais = {a1, a2, a3};

        System.out.println("=== Demonstração de Polimorfismo ===");

        for (Animal animal : animais) {
            animal.emitirSom();
            animal.mover();
            System.out.println();
        }

        System.out.println("=== Demonstração de Sobrecarga ===");

        Papagaio papagaio = new Papagaio("Loro", "Verde");
        papagaio.emitirSom("Olá humanos!");
    }
}

