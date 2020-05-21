/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolarconversao;

import java.util.Scanner;

public class Dolarconversao {

    public static void main(String[] args) {
        double dolar, valor, resultado;
        //entrada
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o valor do dolar no momento");
        dolar = entrada.nextDouble();
        System.out.println("Digite a quantia que quer converter");
        valor = entrada.nextDouble();
        //processamento 
        resultado = (valor/dolar);
        //saida
        System.out.println ("O valor convertido é de"+resultado+ "Dólars");
                
        

    }
    
}
