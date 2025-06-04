import java.io.FileReader;
import java.io.IOException;

public class LeitorArquivo {

    public void lerArquivo() throws IOException {
        FileReader fr = new FileReader("exemplo.txt"); // Arquivo pode não existir
        System.out.println("Arquivo lido com sucesso.");
    }
}
