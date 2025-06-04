import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class Operacoes {

    public void executarOperacoes() {
        try {
            lerArquivo();
            acessarBancoDeDados();
        } catch (IOException e) {
            System.out.println("Erro de leitura de arquivo: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Erro de acesso ao banco de dados: " + e.getMessage());
        }
    }

    private void lerArquivo() throws IOException {
        // Simula tentativa de abrir arquivo que não existe
        FileReader fr = new FileReader("inexistente.txt");
    }

    private void acessarBancoDeDados() throws SQLException {
        // Simula falha no banco
        throw new SQLException("Falha na conexão com o banco.");
    }
}
