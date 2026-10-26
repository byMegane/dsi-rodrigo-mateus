
package psv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL_PADRAO =
            "jdbc:mysql://127.0.0.1:3306/estacionamento";

    public static Connection abrirConexao() {
        String url = System.getenv("ESTACIONAMENTO_DB_URL");
        String usuario = System.getenv("ESTACIONAMENTO_DB_USER");
        String senha = System.getenv("ESTACIONAMENTO_DB_PASSWORD");

        if (url == null || url.isBlank()) {
            url = URL_PADRAO;
        }

        // Configuração padrão para o computador da escola.
        if (usuario == null || usuario.isBlank()) {
            usuario = "root";
        }

        // Se a variável da senha não existir, usa senha vazia.
        if (senha == null) {
            senha = "";
        }

        try {
            Connection con = DriverManager.getConnection(
                    url, usuario, senha
            );

            System.out.println("Conexao aberta com sucesso!");
            return con;

        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco:");
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
