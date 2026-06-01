package atv01_AbrirConexaoComBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AbrirConexaoSemTratamentoDeExecoes {
    // Dados de conexão
    private static final String URL = "jdbc:mysql://localhost:3306/bancoTeste01";
    private static final String USUARIO = "root";
    private static final String SENHA = "marcela";
    // Metodo para obter a conexão
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        // Carrega o driver JDBC
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Cria a conexão
        Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
        System.out.println("Conexão realizada com sucesso! Sem Excecao Tratada");
        return conn;
    }
}
