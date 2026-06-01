package atv03_Throws;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        LeitorArquivo leitor = new LeitorArquivo();

        try {
            leitor.lerArquivo(); // Obrigatório tratar IOException
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        System.out.println("Programa finalizado.");
    }
}
