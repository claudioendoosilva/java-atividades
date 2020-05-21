
package conversaohoras_java;

import java.util.Scanner;

public class Conversaohoras_java {

    public static void main(String[] args) {
        double hora, minutos, result1, result2;
        //entrada
        Scanner entrada = new Scanner (System.in);
        System.out.println ("Digite apenas a hora");
        hora = entrada.nextDouble ();
        System.out.println ("Digite os minutos");
        minutos = entrada.nextDouble ();
        //processamento
        result1 = (minutos/60);
        result2 = (hora+result1);
        //saida
        System.out.println ("O resultado é:"+result2);
        

    }
    
}
