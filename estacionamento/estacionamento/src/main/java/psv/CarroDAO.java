/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;

/**
 *
 * @author rodri
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarroDAO {

    private final Connection con;

    public CarroDAO(Connection con) {
        this.con = con;
    }

    // INSERIR um carro
    public String inserir(CarroBean carro) {
        String sql = "INSERT INTO carro (placa, cor, descricao) "
                   + "VALUES (?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, carro.getPlaca());
            ps.setString(2, carro.getCor());
            ps.setString(3, carro.getDescricao());

            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso.";
            }

            return "Erro ao inserir.";

        } catch (SQLException e) {
            return "Erro ao inserir: " + e.getMessage();
        }
    }

    // ALTERAR um carro existente
    public String alterar(CarroBean carro) {
        String sql = "UPDATE carro SET cor = ?, descricao = ? "
                   + "WHERE placa = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, carro.getCor());
            ps.setString(2, carro.getDescricao());
            ps.setString(3, carro.getPlaca());

            if (ps.executeUpdate() > 0) {
                return "Alterado com sucesso.";
            }

            return "Nenhum carro encontrado com essa placa.";

        } catch (SQLException e) {
            return "Erro ao alterar: " + e.getMessage();
        }
    }

    // EXCLUIR um carro
    public String excluir(CarroBean carro) {
        String sql = "DELETE FROM carro WHERE placa = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, carro.getPlaca());

            if (ps.executeUpdate() > 0) {
                return "Excluido com sucesso.";
            }

            return "Nenhum carro encontrado com essa placa.";

        } catch (SQLException e) {
            return "Erro ao excluir: " + e.getMessage();
        }
    }

    // LISTAR todos os carros
    public List<CarroBean> listarTodos() {
        String sql = "SELECT placa, cor, descricao FROM carro";

        List<CarroBean> listaCarro = new ArrayList<>();

        try (PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                CarroBean carro = new CarroBean();

                carro.setPlaca(rs.getString("placa"));
                carro.setCor(rs.getString("cor"));
                carro.setDescricao(rs.getString("descricao"));

                listaCarro.add(carro);
            }

            return listaCarro;

        } catch (SQLException e) {
            System.out.println(
                "Erro ao listar carros: " + e.getMessage()
            );

            return null;
        }
    }
}

