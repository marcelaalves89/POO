package atv01_AbrirConexaoComBD;

import java.sql.Connection;

public class TesteConexao {
    public static void main(String[] args) throws Exception {
        System.out.println("Testando conexão...");
        Connection conn = AbrirConexaoComTratamentoDeExecoes.getConnection();
    }
}
