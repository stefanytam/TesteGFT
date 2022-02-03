/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package um;

/**
 *
 * @author stefa
 */
public class InvestimentoComIR extends Investimento {

    @Override
    public double calcularLucro(int meses) {
        if (meses < 6) {
            jurosMensais = 22.5 / 100;
            return Math.pow((valorInicial * (1 + jurosMensais)), meses) - valorInicial;
        } else if (meses >= 6 && meses < 12) {
            jurosMensais = 20 / 100;
            return Math.pow((valorInicial * (1 + jurosMensais)), meses) - valorInicial;
        } else if (meses >= 12 && meses < 24) {
            jurosMensais = 17.5 / 100;
            return Math.pow((valorInicial * (1 + jurosMensais)), meses) - valorInicial;
        } else if (meses >= 24) {
            jurosMensais = 15 / 100;
            return Math.pow((valorInicial * (1 + jurosMensais)), meses) - valorInicial;
        } else {
            return Math.pow((valorInicial * (1 + jurosMensais)), meses) - valorInicial;
        }
    }
}
