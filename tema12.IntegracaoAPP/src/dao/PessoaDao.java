package dao;

import model.Pessoa;// Importa a classe Pessoa
import util.Conexao;// Importa a classe responsável pela conexão com o banco

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PessoaDao {

    public void inserir(Pessoa pessoa) {
        String sql = "INSERT INTO pessoa(nome) VALUES (?)";
        try (
                Connection conn = Conexao.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement(sql)
        ) {
            stmt.setString(1, pessoa.getNome());
            stmt.executeUpdate();
            System.out.println("Pessoa cadastrada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    public Pessoa buscarPorNome(String nome) {
        String sql =
                "SELECT * FROM pessoa WHERE nome = ?";
        try (
                Connection conn = Conexao.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Pessoa pessoa = new Pessoa();
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                return pessoa;
            }
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return null;
    }
}
