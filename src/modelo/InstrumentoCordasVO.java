/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author William Soares
 * @since 5/07/2018 - 13:18
 * @version 1.0
 */
public class InstrumentoCordasVO {
    private long idInstrumentoCorda;
    private String marca;
    private String modelo;
    private int ano;
    private double ValorCustoCordas;
    private int quantidade;
    

    public InstrumentoCordasVO() {
    }

    public InstrumentoCordasVO(long idInstrumentoCorda, String marca, String modelo, int ano, double ValorCustoCordas, int quantidade) {
        this.idInstrumentoCorda = idInstrumentoCorda;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ValorCustoCordas = ValorCustoCordas;
        this.quantidade = quantidade;
    }

    public long getIdInstrumentoCorda() {
        return idInstrumentoCorda;
    }

    public void setIdInstrumentoCorda(long idInstrumentoCorda) {
        this.idInstrumentoCorda = idInstrumentoCorda;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorCustoCordas() {
        return ValorCustoCordas;
    }

    public void setValorCustoCordas(double ValorCustoCordas) {
        this.ValorCustoCordas = ValorCustoCordas;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    

    @Override
    public String toString() {
        return "IntrumentoCordasPO{" + "idInstrumentoCorda=" + idInstrumentoCorda + ", marca=" + marca + ", modelo=" + modelo + ", valorcusto=" + ValorCustoCordas + ", quantidade=" + quantidade + '}';
    }
    
    
}
