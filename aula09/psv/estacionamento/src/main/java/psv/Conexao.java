/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;
import java.sql.*;

/**
 *
 * @author Camargo
 */
public class Conexao {
    public static Connection abrirConexao() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
                String url = "";
                url += "jdbc:mysql://127.0.0.1/estacionamento?";
                url += "user=root&password="; 
        }
    }
    
    public static getConnection priverManager {
    String url = "";
    url += "jdbc:mysql://127.0.0.1/estacionamento?";
    url += "user=root&password="; 
    }
}
