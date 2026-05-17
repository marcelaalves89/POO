package atv06_LinkedList_Faculdade_Curso;

class Curso {
    private String nome;

    public Curso(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Curso: " + nome;
    }
}