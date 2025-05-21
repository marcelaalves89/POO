public class MaterialBibliografico {
    protected String titulo;
    protected String codigo;

    public MaterialBibliografico(String titulo,String codigo) {
        this.titulo = titulo;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void emprestar() {
        //lógica de emprestimo aqui da classe Base
        System.out.println("Livro Emprestado da clase Base Material bibliográfico" +getTitulo());
    }
}
