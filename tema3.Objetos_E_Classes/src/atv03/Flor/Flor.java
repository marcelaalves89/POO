package atv03.Flor;

public class Flor {
    // Atributos
    String nome;
    String cor;
    boolean possuiPerfume;

    // Metodo para exibir os dados da flor
    void mostrarDados() {
        System.out.println("Nome da flor: " + nome);
        System.out.println("Cor da flor: " + cor);

        if (possuiPerfume) {
            System.out.println("Possui perfume: Sim");
        } else {
            System.out.println("Possui perfume: Não");
        }
    }
}
