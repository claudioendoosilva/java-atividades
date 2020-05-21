
package carroimposto_java;

import java.util.Scanner;

public class Carroimposto_java {

    public static void main(String[] args) {
        double precocarro, preco2, precofinal;
        //entrada
        Scanner entrada = new Scanner (System.in);
        System.out.println ("Digite o preço do carro");
        precocarro = entrada.nextDouble ();
        //processamento
        preco2 = (precocarro*1.45);
        precofinal = (preco2*1.28);
        //saida
        System.out.println ("O preço final do carro é:"+precofinal+" reais");
        
                
        
               

    }
    
}
