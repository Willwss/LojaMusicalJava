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
public class InstrumentoPercussaoVO {
    private long idInstrumentoPercussao;
    private String marca;
    private String modelo;
    private int ano;
    private double valorcusto;
    private int quantidade;

    public InstrumentoPercussaoVO() {
    }

    public InstrumentoPercussaoVO(long idInstrumentoPercussao, String marca, String modelo, int ano, double valorcusto, int quantidade) {
        this.idInstrumentoPercussao = idInstrumentoPercussao;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valorcusto = valorcusto;
        this.quantidade = quantidade;
    }

    public long getIdInstrumentoPercussao() {
        return idInstrumentoPercussao;
    }

    public void setIdInstrumentoPercussao(long idInstrumentoPercussao) {
        this.idInstrumentoPercussao = idInstrumentoPercussao;
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

    public double getValorcusto() {
        return valorcusto;
    }

    public void setValorcusto(double valorcusto) {
        this.valorcusto = valorcusto;
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
        return "InstrumentoPercussaoVO{" + "idInstrumentoPercussao=" + idInstrumentoPercussao + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", valorcusto=" + valorcusto + ", quantidade=" + quantidade + '}';
    }
    
    
}