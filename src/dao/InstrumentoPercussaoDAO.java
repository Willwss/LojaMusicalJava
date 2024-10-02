/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.InstrumentoPercussaoVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author William Soares
 * @since 05/07/2018
 * @version 1.0
 */
public class InstrumentoPercussaoDAO {
    
    public void cadastrarInstrumentoPercussao(InstrumentoPercussaoVO pVO) throws SQLException {
         
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            sql = "insert into percussao(idinstrumentopercussao, marca, modelo, ano, valorcusto, quantidade)"
                    + "values(null, '" + pVO.getMarca()+ "',"
                    + " '" + pVO.getModelo()+ "',"
                    + " "+pVO.getAno()+","
                    + " "+pVO.getValorcusto()+","
                    + " "+pVO.getQuantidade()+")";

            stat.execute(sql);

        } catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar o instrumento!");
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
     
     public ArrayList<InstrumentoPercussaoVO> buscarInstrumentoPercussao() throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;
        
            sql = "select * from percussao";

            ResultSet rs = stat.executeQuery(sql);

            ArrayList<InstrumentoPercussaoVO> perc = new ArrayList<>();

            while (rs.next()) {
                
                InstrumentoPercussaoVO p = new InstrumentoPercussaoVO();

                p.setIdInstrumentoPercussao(rs.getLong("idinstrumentopercussao"));
                p.setModelo(rs.getString("modelo"));
                p.setMarca(rs.getString("marca"));
                p.setAno(rs.getInt("ano"));
                p.setValorcusto(rs.getDouble("valorcusto"));
                p.setQuantidade(rs.getInt("quantidade"));

                perc.add(p);
            }//fecha while
            
            return perc;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar produtos! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
     
     public void alterarInstrumentoPercussao(InstrumentoPercussaoVO pVO) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            sql = "update percussao set marca='" + pVO.getMarca()
                    + "', modelo='" + pVO.getModelo()
                    + ", ano=" + pVO.getAno()
                    + "', valorcusto=" + pVO.getValorcusto()
                    + ", quantidade=" + pVO.getQuantidade()
                    + " where idinstrumentocorda = "+pVO.getIdInstrumentoPercussao();

            stat.execute(sql);

        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir produto!");
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
     
     public ArrayList<InstrumentoPercussaoVO> filtrar(String query) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;
           
            sql = "select * from percussao "+query;
            ResultSet rs = stat.executeQuery(sql);

            ArrayList<InstrumentoPercussaoVO> perc = new ArrayList<>();

            while (rs.next()) {
                
                InstrumentoPercussaoVO p = new InstrumentoPercussaoVO();

                p.setIdInstrumentoPercussao(rs.getLong("idinstrumentopercussao"));
                p.setModelo(rs.getString("modelo"));
                p.setMarca(rs.getString("marca"));
                p.setQuantidade(rs.getInt("ano"));
                p.setValorcusto(rs.getDouble("valorcusto"));
                p.setQuantidade(rs.getInt("quantidade"));

                perc.add(p);
            }//fecha while

            return perc;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar instrumentos! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
     
     public void deletarInstrumentoPercussao(long id) throws SQLException{
            Connection con = ConexaoBanco.getConexao();
            Statement stat = con.createStatement();
            
            try {
                String sql = "delete from percussao where idprodutopercussao="+id;
                stat.execute(sql);
            
        } catch (SQLException e) {
            throw new SQLException("Erro ao deletar!" + e.getMessage());
        }finally{
                stat.close();
                con.close();
            }
    }//Fecha deletarProduto
}
