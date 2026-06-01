package atv01_AbrirConexaoComBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AbrirConexaoComTratamentoDeExecoes {
    // Dados de conexão
    private static final String URL =
            "jdbc:mysql://localhost:3306/bancoTeste01";
    private static final String USUARIO = "root";
    private static final String SENHA = "marcela";
    // Metodo para obter a conexão
    public static Connection getConnection() {
        Connection conn = null;
        try {
            // Carrega o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Abre a conexão com o banco
            conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conexão realizada com sucesso! Com Excecao Tratada");
        } catch (ClassNotFoundException e) {
            System.out.println("Erro: Driver JDBC não encontrado!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados!");
            e.printStackTrace();
        }
        return conn;
    }
}