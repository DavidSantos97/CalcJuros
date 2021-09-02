/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Conversor {
    
    public static void main(String[] args) {
        //Declaração de VAriaves 
        double cap, tax, per, jur;
        
        //Objeto de entrada
        Scanner entrada = new Scanner(System.in);
        
        //Apresentação
        System.out.println("\n\t\t\t -- Caulculadora de Juros -- \n");
        
        //Entrada
        System.out.println("Informe o Capital Inicial: ");
        cap = entrada.nextDouble();
        
        System.out.println("Informe a Taxa de Juros: ");
        tax = entrada.nextDouble();
        
        System.out.println("Informe o Periodo de Captalização: ");
        per = entrada.nextDouble();
        
        //Processamento
        jur = cap * (tax / 100) * per;
        
        //Saida
        System.out.printf("\n\t %f é o valor de juros \n\n", jur);
    }
    
}
