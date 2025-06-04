public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Angela");

        try {
            aluno.setNota(12); // Vai lançar a exceção
        } catch (NotaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Programa finalizado.");
    }
}
