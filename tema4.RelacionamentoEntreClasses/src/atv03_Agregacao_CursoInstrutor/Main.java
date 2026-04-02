package atv03_Agregacao_CursoInstrutor;

public class Main {
    public static void main(String[] args) {
        Instrutor i1 = new Instrutor("Ana Ribeiro", "Engenharia da Computação", "ana@curso.com", 8);
        Curso curso = new Curso("Programação em Java", 60, "Intermediário", "Curso focado em lógica, orientação a objetos e práticas com Java.");

        curso.associarInstrutor(i1);

        curso.exibirCurso();

        i1.aplicarAvaliacao(curso.getNome());
        i1.agendarLive("10/05/2025 às 19h");
    }
}