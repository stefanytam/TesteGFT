/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package um;

/**
 *
 * @author stefa
 */
public class InvestimentoSemIR extends Investimento{
    @Override
    public double calcularLucro(int meses) {
        if(valorInicial<1000){
            System.out.println("O valor Inicial não pode ser menor que R$1000");
            return 0;
        }
        return Math.pow((valorInicial * (1 + jurosMensais)), meses) - valorInicial;
    }
}
