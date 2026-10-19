
package psv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL =
            "jdbc:mysql://localhost:3306/estacionamento";

    private static final String USUARIO = "root";

    public static Connection abrirConexao() {
        try {
            String senha = System.getenv("ESTACIONAMENTO_DB_PASSWORD");

            if (senha == null || senha.isBlank()) {
                System.out.println(
                        "Configure a variavel ESTACIONAMENTO_DB_PASSWORD."
                );
                return null;
            }

            Connection con = DriverManager.getConnection(
                    URL, USUARIO, senha
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
