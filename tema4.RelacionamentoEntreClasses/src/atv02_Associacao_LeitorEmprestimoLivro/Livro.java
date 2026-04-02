package atv02_Associacao_LeitorEmprestimoLivro;

public class Livro {private String titulo;
    private String autor;
    private String isbn;
    private boolean emprestado;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.emprestado = false;
    }

    public void marcarComoEmprestado() {
        emprestado = true;
    }

    public void marcarComoDisponivel() {
        emprestado = false;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public String exibirInformacoes() {
        return "Livro: " + titulo + " | Autor: " + autor + " | ISBN: " + isbn;
    }
}
