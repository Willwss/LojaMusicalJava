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
import modelo.InstrumentoCordasVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author William Soares
 * @since 05/07/2018
 * @version 1.0
 */
public class InstrumentoCordasDAO {
    
     public void cadastrarInstrumentoCordas(InstrumentoCordasVO cVO) throws SQLException {
         
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            sql = "insert into cordas(idinstrumentocorda, marca, modelo, ano, valorcusto, quantidade)"
                    + "values(null, '" + cVO.getMarca()+ "',"
                    + " '" + cVO.getModelo()+ "',"
                    + " "+cVO.getAno()+","
                    + " "+cVO.getValorCustoCordas()+","
                    + " "+cVO.getQuantidade()+")";

            stat.execute(sql);

        } catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar o instrumento!");
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
     
     public ArrayList<InstrumentoCordasVO> buscarInstrumentoCordas() throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;
        
            sql = "select * from cordas";

            ResultSet rs = stat.executeQuery(sql);

            ArrayList<InstrumentoCordasVO> corda = new ArrayList<>();

            while (rs.next()) {
                
                InstrumentoCordasVO c = new InstrumentoCordasVO();

                c.setIdInstrumentoCorda(rs.getLong("idinstrumentocorda"));
                c.setModelo(rs.getString("modelo"));
                c.setMarca(rs.getString("marca"));
                c.setAno(rs.getInt("ano"));
                c.setValorCustoCordas(rs.getDouble("valorcusto"));
                c.setQuantidade(rs.getInt("quantidade"));

                corda.add(c);
            }//fecha while
            
            return corda;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar produtos! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
     
     public void alterarInstrumentoCordas(InstrumentoCordasVO cVO) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            sql = "update cordas set marca='" + cVO.getMarca()
                    + "', modelo='" + cVO.getModelo()
                    + "', valorcusto=" + cVO.getValorCustoCordas()
                    + ", ano=" + cVO.getAno()
                    + ", quantidade=" + cVO.getQuantidade()
                    + " where idinstrumentocorda = "+cVO.getIdInstrumentoCorda();

            stat.execute(sql);

        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir produto!");
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
     
     public ArrayList<InstrumentoCordasVO> filtrar(String query) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;
           
            sql = "select * from cordas "+query;
            ResultSet rs = stat.executeQuery(sql);

            ArrayList<InstrumentoCordasVO> corda = new ArrayList<>();

            while (rs.next()) {
                
                InstrumentoCordasVO c = new InstrumentoCordasVO();

                c.setIdInstrumentoCorda(rs.getLong("idinstrumentocorda"));
                c.setModelo(rs.getString("modelo"));
                c.setMarca(rs.getString("marca"));
                c.setAno(rs.getInt("ano"));
                c.setValorCustoCordas(rs.getDouble("valorcusto"));
                c.setQuantidade(rs.getInt("quantidade"));

                corda.add(c);
            }//fecha while

            return corda;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar instrumentos! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
     
     public void deletarInstrumentoCorda(long id) throws SQLException{
            Connection con = ConexaoBanco.getConexao();
            Statement stat = con.createStatement();
            
            try {
                String sql = "delete from cordas where idinstrumentocorda="+id;
                stat.execute(sql);
            
        } catch (SQLException e) {
            throw new SQLException("Erro ao deletar!" + e.getMessage());
        }finally{
                stat.close();
                con.close();
            }
    }//Fecha deletarProduto
}//Fecha classe