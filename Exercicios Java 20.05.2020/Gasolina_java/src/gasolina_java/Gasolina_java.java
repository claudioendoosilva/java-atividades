
package gasolina_java;

import java.util.Scanner;

public class Gasolina_java {

    public static void main(String[] args) {
        double kilo, consome, preco, total, total2, total3;
        //entrada
        Scanner entrada = new Scanner (System.in);
        System.out.println ("Digite quantos Kilômetros você percorreu");
        kilo = entrada.nextDouble();
        System.out.println ("Digite a quantidade de gasolina que seu carro consome");
        consome = entrada.nextDouble();
        System.out.println ("Digite o preço da gasolina");
        preco = entrada.nextDouble();
        //processamento
        total = (kilo/consome);
        total2 = (total*preco);
        total3 = (total2*2);
        //saida
        System.out.println("Será gasto em média"+total2+" R$ para ida e"+total3+" R$ para ida e volta");
                

    }
    
}
