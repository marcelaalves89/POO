package controller;

import dao.PessoaDao;
import model.Pessoa;

// Classe responsável por controlar as ações da aplicação
public class PessoaController {
    // Cria um objeto DAO para acessar o banco de dados
    private PessoaDao dao = new PessoaDao();

    // Metodo responsável por cadastrar uma pessoa
    public void cadastrarPessoa(String nome) {
        // Cria um objeto Pessoa
        Pessoa pessoa = new Pessoa();
        // Define o nome da pessoa
        pessoa.setNome(nome);
        // Solicita ao DAO que grave a pessoa no banco
        dao.inserir(pessoa);
    }
    // Metodo responsável por consultar uma pessoa
    public Pessoa consultarPessoa(String nome) {
        // Solicita ao DAO a busca da pessoa e retorna o resultado
        return dao.buscarPorNome(nome);
    }
}


