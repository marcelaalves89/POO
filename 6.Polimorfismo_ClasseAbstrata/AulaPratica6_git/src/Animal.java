public abstract class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Metodo a ser sobrescrito
    public void emitirSom() {
        System.out.println(nome + " emitindo som genérico.");
    }

    //Metodo Abstrato
    public abstract void mover();
}

