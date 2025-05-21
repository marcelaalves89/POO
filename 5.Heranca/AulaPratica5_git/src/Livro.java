public class Livro extends MaterialBibliografico {
    private String autor;
    private String isbn;

    public Livro(String titulo, String codigo, String autor, String isbn) {
        super(titulo,codigo);
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void emprestar() {
        //lógica de emprestimo aqui do livro
        super.emprestar();
//        System.out.println("Livro Emprestado: " +getTitulo());
        System.out.println("Livro Emprestado superclasse: " +this.titulo);

    }
}
