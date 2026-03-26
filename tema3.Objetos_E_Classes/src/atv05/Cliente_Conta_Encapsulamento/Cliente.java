package atv05.Cliente_Conta_Encapsulamento;

public class Cliente {
    public String nome;

    // Construtor
    public Cliente(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}
