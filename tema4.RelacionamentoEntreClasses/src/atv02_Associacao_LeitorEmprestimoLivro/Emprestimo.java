package atv02_Associacao_LeitorEmprestimoLivro;

import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Leitor leitor;
    private LocalDate dataRetirada;
    private LocalDate dataDevolucao;

    public Emprestimo(Livro livro, Leitor leitor, LocalDate dataRetirada, LocalDate dataDevolucao) {
        this.livro = livro;
        this.leitor = leitor;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        livro.marcarComoEmprestado();
        leitor.confirmarEmprestimo(livro.exibirInformacoes());
    }

    public void exibirResumo() {
        System.out.println("Empréstimo:");
        System.out.println(leitor.exibirInformacoes());
        System.out.println(livro.exibirInformacoes());
        System.out.println("Retirada: " + dataRetirada + " | Devolução prevista: " + dataDevolucao);
    }

    public void devolverLivro() {
        livro.marcarComoDisponivel();
        System.out.println("Livro devolvido: " + livro.exibirInformacoes());
    }

    public boolean estaAtrasado(LocalDate hoje) {
        return hoje.isAfter(dataDevolucao);
    }
}
