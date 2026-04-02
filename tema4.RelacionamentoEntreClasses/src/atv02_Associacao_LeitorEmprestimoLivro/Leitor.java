package atv02_Associacao_LeitorEmprestimoLivro;

public class Leitor {private String nome;
    private String matricula;
    private String email;
    private String telefone;

    public Leitor(String nome, String matricula, String email, String telefone) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.telefone = telefone;
    }

    public void atualizarContato(String novoEmail, String novoTelefone) {
        this.email = novoEmail;
        this.telefone = novoTelefone;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String exibirInformacoes() {
        return "Leitor: " + nome + " | Matrícula: " + matricula;
    }

    public void confirmarEmprestimo(String tituloLivro) {
        System.out.println(nome + " realizou o empréstimo do livro: " + tituloLivro);
    }
}