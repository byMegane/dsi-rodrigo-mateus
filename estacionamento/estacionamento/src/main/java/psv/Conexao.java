
package psv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL =
            "jdbc:mysql://localhost:3306/estacionamento";

    private static final String USUARIO = "root";

    private static final String SENHA = "Guardadamoita_2";

    public static Connection abrirConexao() {
        try {
            Connection con = DriverManager.getConnection(
                    URL, USUARIO, SENHA
            );

            System.out.println("Conexao aberta com sucesso!");
            return con;

        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao MySQL:");
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static void fecharConexao(Connection con) {
        if (con != null) {
            try {
                con.close();
                System.out.println("Conexao fechada.");
            } catch (SQLException e) {
                System.out.println(
                        "Erro ao fechar conexao: " + e.getMessage()
                );
            }
        }
    }
}
