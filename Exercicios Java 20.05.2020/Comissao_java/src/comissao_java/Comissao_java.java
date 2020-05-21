
package comissao_java;

import java.util.Scanner;

public class Comissao_java {

    public static void main(String[] args) {
        double salario, precounit, quantidade;
        //entrada
        Scanner entrada = new Scanner (System.in);
        System.out.println ("Qual o preço unitário das peças?");
        precounit = entrada.nextDouble ();
        System.out.println ("Qual a quantidade de peças que você vendeu?");
        quantidade = entrada.nextDouble ();
        //processamento
        salario = (precounit*quantidade)*0.05;
        //saida
        System.out.println ("A sua comissão é de "+ salario + "reais");
                
        
        
        
    
    }
    
}
