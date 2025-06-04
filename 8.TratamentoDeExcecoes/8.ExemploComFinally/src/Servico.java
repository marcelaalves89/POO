import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class Servico {

    public void executar() throws IOException, SQLException {
        // Simula tentativa de abrir arquivo
        FileReader fr = new FileReader("arquivo_inexistente.txt");

        // Simula operação que pode lançar SQLException
        throw new SQLException("Erro no acesso ao banco de dados.");
    }
}
