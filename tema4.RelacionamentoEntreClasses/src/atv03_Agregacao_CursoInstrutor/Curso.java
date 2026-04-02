package atv03_Agregacao_CursoInstrutor;

public class Curso {
    private String nome;
    private int cargaHoraria;
    private String nivel;
    private String descricao;

    private Instrutor instrutor1;
    private Instrutor instrutor2;

    public Curso(String nome, int cargaHoraria, String nivel, String descricao) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.nivel = nivel;
        this.descricao = descricao;
    }

    public void associarInstrutor(Instrutor instrutor) {
        if (instrutor1 == null) {
            instrutor1 = instrutor;
        } else if (instrutor2 == null) {
            instrutor2 = instrutor;
        } else {
            System.out.println("Não é possível adicionar mais instrutores a este curso.");
        }
    }

    public void exibirCurso() {
        System.out.println("\nCurso: " + nome);
        System.out.println("Carga Horária: " + cargaHoraria + "h");
        System.out.println("Nível: " + nivel);
        System.out.println("Descrição: " + descricao);
        System.out.println("Instrutores associados:");

        if (instrutor1 != null) instrutor1.exibirInstrutor();
        if (instrutor2 != null) instrutor2.exibirInstrutor();
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getNivel() {
        return nivel;
    }

    public String getDescricao() {
        return descricao;
    }
}
