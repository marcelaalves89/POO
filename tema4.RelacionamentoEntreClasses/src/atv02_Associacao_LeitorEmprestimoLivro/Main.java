package atv02_Associacao_LeitorEmprestimoLivro;

import java.time.LocalDate;

public class Main {public static void main(String[] args) {
    // Criar um leitor
    Leitor leitor1 = new Leitor("Maria Silva", "2021001", "maria@email.com", "99999-1234");

    // Criar um livro
    Livro livro1 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", "978-3-16-148410-0");

    // Registrar um empréstimo
    LocalDate dataHoje = LocalDate.now();
    LocalDate dataDevolucao = dataHoje.plusDays(7);

    Emprestimo emprestimo1 = new Emprestimo(livro1, leitor1, dataHoje, dataDevolucao);

    // Exibir resumo do empréstimo
    emprestimo1.exibirResumo();

    // Verificar se o empréstimo está atrasado
    boolean atrasado = emprestimo1.estaAtrasado(LocalDate.now().plusDays(8));
    System.out.println("Está atrasado? " + (atrasado ? "Sim" : "Não"));

    // Devolver o livro
    emprestimo1.devolverLivro();
    System.out.println("Status do livro após devolução: " + (livro1.isEmprestado() ? "Emprestado" : "Disponível"));
}
}
