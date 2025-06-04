import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Servico servico = new Servico();

        try {
            servico.executar();
        } catch (IOException e) {
            System.out.println("Erro de arquivo: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Erro de banco de dados: " + e.getMessage());
        } finally {
            System.out.println("Bloco finally executado sempre, para limpeza ou finalização.");
        }

        System.out.println("Fim do programa.");
    }
}
