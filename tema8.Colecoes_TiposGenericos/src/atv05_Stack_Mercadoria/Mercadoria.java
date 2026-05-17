package atv05_Stack_Mercadoria;
class Mercadoria {
    private String nome;

    public Mercadoria(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    // Sobrescrevendo toString()
    @Override
    public String toString() {
        return "Produto: " + nome;
    }
}