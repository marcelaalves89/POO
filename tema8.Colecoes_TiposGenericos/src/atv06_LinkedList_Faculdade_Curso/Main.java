package atv06_LinkedList_Faculdade_Curso;

public class Main {

    public static void main(String[] args) {
        Faculdade faculdade = new Faculdade();

        faculdade.adicionarCurso(new Curso("Engenharia"));
        faculdade.adicionarCurso(new Curso("Direito"));
        faculdade.adicionarCurso(new Curso("Computação"));

        System.out.println("=== LISTA DE CURSOS ===");
        faculdade.listarCursos();
        System.out.println("\n=== PRIMEIRO CURSO ===");
        faculdade.mostrarPrimeiroCurso();
        System.out.println("\n=== ÚLTIMO CURSO ===");
        faculdade.mostrarUltimoCurso();
        System.out.println("\n=== REMOVENDO PRIMEIRO CURSO ===");
        faculdade.removerPrimeiroCurso();
        System.out.println("\n=== LISTA APÓS REMOÇÃO ===");
        faculdade.listarCursos();
        System.out.println("\n=== QUANTIDADE DE CURSOS ===");
        faculdade.quantidadeCursos();
        System.out.println("\n=== A LISTA ESTÁ VAZIA? ===");
        faculdade.verificarListaVazia();
    }
}
