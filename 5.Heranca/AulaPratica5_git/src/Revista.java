public class Revista extends MaterialBibliografico {
    private String mesAnoEdicao;

    public Revista(String titulo, String codigo, String mesAnoEdicao) {
        super(titulo,codigo);
        this.mesAnoEdicao = mesAnoEdicao;
    }

    public String getMesAnoEdicao() {
        return mesAnoEdicao;
    }
    public void setMesAnoEdicao(String mesAnoEdicao) {
        this.mesAnoEdicao = mesAnoEdicao;
    }

    public void emprestar() {
        //lógica de emprestimo aqui da Revista aqui
        super.emprestar();
//        System.out.println("Revista Emprestada: "+getTitulo());
    }
}
