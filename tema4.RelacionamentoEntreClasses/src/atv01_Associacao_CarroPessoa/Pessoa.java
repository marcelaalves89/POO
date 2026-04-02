package atv01_Associacao_CarroPessoa;

public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }
    // Associação simples: Pessoa usa Carro
    public void usarCarro(Carro carro) {
        System.out.println(nome + " está usando o carro:");
        carro.dirigir();  // a Pessoa utiliza metodo publico de Carro
    }
}
