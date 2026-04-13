package atv01_HerancaSimples;

public class Professor extends Pessoa {

    private String disciplina;

    // Construtor usando super
    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    // Novo método da classe filha
    public void ensinar() {
        System.out.println("Disciplina: " + disciplina);
    }
}
