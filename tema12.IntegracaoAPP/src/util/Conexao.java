package util;

// Importa a classe Connection, responsável por representar uma conexão com o banco de dados
import java.sql.Connection;
// Importa a classe DriverManager, responsável por abrir conexões com o banco
import java.sql.DriverManager;
// Importa a classe SQLException, utilizada para tratar erros de banco de dados
import java.sql.SQLException;

public class Conexao {
    // Endereço do banco de dados
    // jdbc:mysql:// -> informa que será utilizado o banco MySQL
    // localhost -> servidor onde o banco está instalado
    // 3306 -> porta padrão do MySQL
    // nomeMeuSistema -> nome do banco de dados
    private static final String URL = "jdbc:mysql://localhost:3306/nomeMeuSistema";
    private static final String USUARIO = "root";
    private static final String SENHA = "marcela";
    // Metodo responsável por abrir e retornar uma conexão
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}
