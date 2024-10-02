/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

/**
 *
 * @author William Soares
 * @since 07/07/2018
 * @version 1.0
 */
public class ServicosFactory {
    private static InstrumentoCordaServicos instrumentoCordasServicos= new InstrumentoCordaServicos();
    private static InstrumentoPercussaoServicos instrumentoPercussaoServicos= new InstrumentoPercussaoServicos();

   public static InstrumentoCordaServicos getInstrumentoCordasServicos(){
       
       return instrumentoCordasServicos;
    }
   
   public static InstrumentoPercussaoServicos getInstrumentoPercussaoServicos(){
       
       return instrumentoPercussaoServicos;
    }
}