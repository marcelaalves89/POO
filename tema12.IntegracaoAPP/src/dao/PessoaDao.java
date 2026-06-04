package dao;

import model.Pessoa;// Importa a classe Pessoa
import util.Conexao;// Importa a classe responsável pela conexão com o banco

// Importa a classe Connection, utilizada para representar uma conexão com o banco
import java.sql.Connection;
// Importa a classe PreparedStatement, utilizada para executar comandos SQL
import java.sql.PreparedStatement;
// Importa a classe ResultSet, utilizada para armazenar resultados de consultas
import java.sql.ResultSet;
// Importa a classe SQLException, utilizada para tratar erros de banco
import java.sql.SQLException;

// Classe responsável por acessar a tabela pessoa do banco de dados
public class PessoaDao {
    public void inserir(Pessoa pessoa) {
        String sql = "INSERT INTO pessoa(nome) VALUES (?)";
        // Abre a conexão com o banco e prepara o comando SQL
        try (
                // Obtém uma conexão com o banco
                Connection conn = Conexao.getConnection();
                // Prepara o comando SQL para execução
                PreparedStatement stmt =
                        conn.prepareStatement(sql)
        ) {
            // Substitui o ? pelo nome da pessoa
            stmt.setString(1, pessoa.getNome());
            // Executa o comando INSERT
            stmt.executeUpdate();
            System.out.println("Pessoa cadastrada com sucesso!");
        } catch (SQLException e) {
            // Exibe a mensagem de erro caso ocorra algum problema
            System.out.println("Erro: " + e.getMessage());
        }
    }
    // Metodo responsável por buscar uma pessoa pelo nome
    public Pessoa buscarPorNome(String nome) {
        String sql =
                "SELECT * FROM pessoa WHERE nome = ?";
        try (
                Connection conn = Conexao.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setString(1, nome);
            // Executa a consulta
            ResultSet rs = stmt.executeQuery();
            // Verifica se encontrou algum registro
            if (rs.next()) {
                // Cria um objeto Pessoa
                Pessoa pessoa = new Pessoa();
                // Obtém o valor da coluna id
                pessoa.setId(rs.getInt("id"));
                // Obtém o valor da coluna nome
                pessoa.setNome(rs.getString("nome"));
                // Retorna o objeto preenchido
                return pessoa;
            }
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        // Retorna null caso não encontre a pessoa
        return null;
    }
}
