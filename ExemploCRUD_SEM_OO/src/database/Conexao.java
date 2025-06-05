package database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexao {

    private static final String SCHEMA = "unifesspa";

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/"+ SCHEMA + "?setTimerzone=UTC";
    private static final String USER = "root";
    private static final String PASS = "serenaya";

    public static Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(JDBC_URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver MySQL JDBC Driver não encontrado!");
            e.printStackTrace();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco!");
        }
        return connection;
    }
}
