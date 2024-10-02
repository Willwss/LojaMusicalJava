/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.InstrumentoCordasDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.InstrumentoCordasVO;

/**
 *
 * @author William Soares
 * @since 05/07/2018
 * @version 1.0
 */
public class InstrumentoCordaServicos {
    

    
public void cadastrarInstrumentoCorda(InstrumentoCordasVO cVO) throws SQLException {
    InstrumentoCordasDAO cDAO = DAOFactory.getInstrumentoCordasDAO();
    cDAO.cadastrarInstrumentoCordas(cVO);
}//fecha método

public void alterarInstrumentoCorda(InstrumentoCordasVO cVO) throws SQLException {
    InstrumentoCordasDAO cDAO = DAOFactory.getInstrumentoCordasDAO();
    cDAO.alterarInstrumentoCordas(cVO);
}//fecha método

/**
 * @return Retornando um Array contendo todos os produtos do banco de dados.
 * @throws SQLException Lançando exceção de SQL
 */
public ArrayList<InstrumentoCordasVO> buscarInstrumentoCordas() throws SQLException {
    InstrumentoCordasDAO cDAO = DAOFactory.getInstrumentoCordasDAO();
    return cDAO.buscarInstrumentoCordas();
}//fecha método

public ArrayList<InstrumentoCordasVO> filtrar(String query) throws SQLException {
    InstrumentoCordasDAO cDAO = DAOFactory.getInstrumentoCordasDAO();
    return cDAO.filtrar(query);
}//fecha método

public void deletarInstrumentoCorda(long id) throws SQLException{
    InstrumentoCordasDAO cDAO = DAOFactory.getInstrumentoCordasDAO();
    cDAO.deletarInstrumentoCorda(id);
}

}
