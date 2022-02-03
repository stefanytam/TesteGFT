/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package um;

/**
 *
 * @author stefa
 */
public abstract class Investimento {

    protected double valorInicial;
    protected double jurosMensais;

    //Propriedades
    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public double getJurosMensais() {
        return jurosMensais;
    }

    public void setJurosMensais(double jurosMensais) {
        this.jurosMensais = jurosMensais;
    }

    //Métodos
    public double calcularLucro(int meses) {
        return Math.pow((valorInicial * (1 + jurosMensais)), meses) - valorInicial;
    }
    
}
