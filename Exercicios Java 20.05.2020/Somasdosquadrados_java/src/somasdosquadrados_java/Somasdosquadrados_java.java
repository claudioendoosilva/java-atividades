
package somasdosquadrados_java;

import java.io.PrintStream;
import java.util.Scanner;

public class Somasdosquadrados_java {


    public static void main(String[] args) {
        double a,b,c,d,resp;
        //entrada
        Scanner entrada = new Scanner (System.in);
        System.out.println ("Digite o valor de A");
        a = entrada.nextDouble();
        System.out.println("Digite o valor de B");
        b = entrada.nextDouble ();
        System.out.println ("Digite o valor de C");
        c = entrada.nextDouble ();
        System.out.println ("Digite o valor de D");
        d = entrada.nextDouble ();
        //processamento
        resp = (a*a)+(b*b)+(c*c)+(d*d);
        //saida
        System.out.println ("O resultado da conta é "+resp);
        
               
      
        

    }
    
}
