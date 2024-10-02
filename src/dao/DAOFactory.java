/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author William Soares
 * @since 05/07/2018
 * @version 1.0
 */
public class DAOFactory {
    private static InstrumentoCordasDAO instrumentoCordaDAO = new InstrumentoCordasDAO();
    private static InstrumentoPercussaoDAO instrumentoPercussaoDAO = new InstrumentoPercussaoDAO();
    
    public static InstrumentoCordasDAO getInstrumentoCordasDAO(){
        return instrumentoCordaDAO;
      }//fecha método
    
    public static InstrumentoPercussaoDAO getInstrumentoPercussaoDAO(){
        return instrumentoPercussaoDAO;
      }//fecha método
}
