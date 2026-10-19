package psv;

import java.sql.Connection;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        Connection con = Conexao.abrirConexao();

        if (con == null) {
            System.out.println("Nao foi possivel conectar ao banco.");
            return;
        }

        try {
            CarroDAO dao = new CarroDAO(con);

            CarroBean carro = new CarroBean();
            carro.setPlaca("ZZZ9999");

            System.out.println(dao.excluir(carro));

            List<CarroBean> carros = dao.listarTodos();

            if (carros != null) {
                for (CarroBean c : carros) {
                    System.out.println("Placa: " + c.getPlaca());
                    System.out.println("Cor: " + c.getCor());
                    System.out.println("Descricao: " + c.getDescricao());
                    System.out.println("--------------------");
                }
            }

        } finally {
            Conexao.fecharConexao(con);
        }
    }
}

