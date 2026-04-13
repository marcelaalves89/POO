package atv01_HerancaSimples;

public class Pessoa {

    protected String nome;
    protected int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método da classe base
    public void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
