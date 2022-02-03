/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testegft;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import um.InvestimentoComIR;
import um.InvestimentoSemIR;

/**
 *
 * @author stefa
 */
public class TesteGFT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 1
        InvestimentoComIR comIR = new InvestimentoComIR();
        comIR.setJurosMensais(1.2 / 100);
        comIR.setValorInicial(4000);
        System.out.println("Investimento com IR, Lucro: " + comIR.calcularLucro(17));

        InvestimentoSemIR semIR = new InvestimentoSemIR();
        semIR.setJurosMensais(0.7);
        semIR.setValorInicial(2000);
        System.out.println("Investimento sem IR, Lucro: " + semIR.calcularLucro(10));

        //2
        int vetor[] = new int[10];
        int soma;
        int i;
        int maior, menor;
        List<Integer> lista = new ArrayList<Integer>();
        List<Integer> lista2 = new ArrayList<Integer>();
        
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número: ");
        vetor[0] = s.nextInt();
        
        maior = vetor[0];
        menor = vetor[0];
        soma = vetor[0];
        
        for (i = 1; i < 10; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = s.nextInt();
            if (vetor[i] > maior) {
                maior = vetor[i];
            } else {
                menor = vetor[i];
            }
            soma = soma + vetor[i];
        }
        
        for (i = 0; i < 10; i++) {
            if (vetor[i] > 10) {
                lista.add(vetor[i]);
            }
        }
        
        for (i = 0; i < 10; i++) {
            if (vetor[i] > 50) {
                lista2.add(vetor[i]);
            }
        }
        
        System.out.println("Acima de 10: " + lista);
        System.out.println("Acima de 50: " + lista2);
        double media = soma / 10;
        System.out.println("Soma = " + soma);
        System.out.println("Média = " + media);
        System.out.println("Maior valor = " + maior);
        System.out.println("Menor valor = " + menor);

    }
}
