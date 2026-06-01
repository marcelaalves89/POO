package atv05_EncerrarConexaoBD;
import java.sql.Connection;
import java.sql.SQLException;

public class TesteEncerrarConexao {
    public static void main(String[] args) {

        try {
            Connection conn = AbrirConexaoComBD.getConnection();
            System.out.println("Conexão aberta!");
            conn.close();
            System.out.println("Conexão encerrada!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
