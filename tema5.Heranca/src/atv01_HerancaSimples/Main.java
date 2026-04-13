package atv01_HerancaSimples;

public class Main {
    public static void main(String[] args) {

        Professor prof = new Professor("Carlos", 40, "Programação");

        prof.apresentar(); // metodo herdado da classe Pessoa
        prof.ensinar();    // metodo próprio da classe Professor
    }
}
