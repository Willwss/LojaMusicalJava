/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author William Soares
 * @since 05/07/2018
 * @version 1.0
 */
public class ConexaoBanco {

    //Atributos estáticos com os dados do Banco de Dados
    private static final String URL = "jdbc:mysql://localhost:3306/lojainstrumentomusical";
    private static final String USUARIO = "root";
    private static final String SENHA = "12345";

    //Método que efetua a conexão com o MySQL
    public static Connection getConexao() throws SQLException {
        Connection c = null;
        try {
            c = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException se) {
            throw new SQLException("Erro ao conectar! " + se.getMessage());
        }//fecha catch
        return c;
    }//fecha metodo
    
}//fecha classe

