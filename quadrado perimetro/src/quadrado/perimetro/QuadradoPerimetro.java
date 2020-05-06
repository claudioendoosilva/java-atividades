/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadrado.perimetro;

import java.util.Scanner;


public class QuadradoPerimetro {


    public static void main(String[] args) {
      double lado, resultado;
      Scanner entrada = new Scanner (System.in);
      System.out.println("Digite o valor do lado do quadrado: ");
      lado = entrada.nextDouble();
      resultado = (lado+lado+lado+lado);
      System.out.println ("O perímetro do quadrado é: "+resultado);
    
    }
    
}
