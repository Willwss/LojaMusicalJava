/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.InstrumentoCordasDAO;
import dao.InstrumentoPercussaoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.InstrumentoCordasVO;
import modelo.InstrumentoPercussaoVO;

/**
 *
 * @author William Soares
 * @since 05/07/2018
 * @version 1.0
 */
    public class InstrumentoPercussaoServicos {
        
        public void cadastrarInstrumentoPercussao(InstrumentoPercussaoVO pVO) throws SQLException {
            InstrumentoPercussaoDAO pDAO = DAOFactory.getInstrumentoPercussaoDAO();
            pDAO.cadastrarInstrumentoPercussao(pVO);
        }//fecha método

        public void alterarInstrumentoPercussao(InstrumentoPercussaoVO pVO) throws SQLException {
            InstrumentoPercussaoDAO pDAO = DAOFactory.getInstrumentoPercussaoDAO();
            pDAO.alterarInstrumentoPercussao(pVO);
        }//fecha método

        /**
         * @return Retornando um Array contendo todos os produtos do banco de dados.
         * @throws SQLException Lançando exceção de SQL
         */
        public ArrayList<InstrumentoPercussaoVO> buscarInstrumentoPercussao() throws SQLException {
            InstrumentoPercussaoDAO pDAO = DAOFactory.getInstrumentoPercussaoDAO();
            return pDAO.buscarInstrumentoPercussao();
        }//fecha método

        public ArrayList<InstrumentoPercussaoVO> filtrar(String query) throws SQLException {
            InstrumentoPercussaoDAO pDAO = DAOFactory.getInstrumentoPercussaoDAO();
            return pDAO.filtrar(query);
        }//fecha método

        public void deletarInstrumentoPercussao(long id) throws SQLException{
            InstrumentoPercussaoDAO pDAO = DAOFactory.getInstrumentoPercussaoDAO();
            pDAO.deletarInstrumentoPercussao(id);
        }
}
