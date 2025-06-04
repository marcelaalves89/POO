public class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota) {
        if (nota < 0 || nota > 10) {
            throw new NotaInvalidaException("Nota inválida! A nota deve estar entre 0 e 10.");
        }
        this.nota = nota;
    }

    public void exibirNota() {
        System.out.println(nome + " tem nota: " + nota);
    }
}
