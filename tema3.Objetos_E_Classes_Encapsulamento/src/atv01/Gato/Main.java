package atv01.Gato;

public class Main {

    public static void main(String[] args) {

        // Criando objeto Sushi
        Gato sushi = new Gato();
        sushi.nome = "Sushi";
        sushi.qtdComidaDisponivel = 3;
        sushi.sono = false;

        // Criando objeto Cachaça
        Gato cachaca = new Gato();
        cachaca.nome = "Cachaça";
        cachaca.qtdComidaDisponivel = 1;
        cachaca.sono = false;

        // Simulando comportamentos
        sushi.comer();
        sushi.dormir();

        cachaca.comer();
        cachaca.comer(); // tentativa extra (sem comida)
    }
}