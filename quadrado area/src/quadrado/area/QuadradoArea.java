
package quadrado.area;

import java.util.Scanner;


public class QuadradoArea {

   
    public static void main(String[] args) {
        double lado, resultado;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Qual é o valor do lado do quadrado?: ");
        lado = entrada.nextDouble();
        resultado = (lado*lado);
        System.out.println ("A área do quadrado é: "+resultado);
        
        
        
        
       
    }
    
}
