
package horaextra_java;

import java.util.Scanner;

public class Horaextra_java {

    public static void main(String[] args) {
        double minutos, hora, tempo, reais, ganho, total, result;
        //entrada 
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite apenas as horas que trabalhou");
        hora = entrada.nextDouble();
        System.out.println("Digite os minutos que trabalhou");
        minutos = entrada.nextDouble();
        System.out.println("Digite quanto você ganha por hora");
        reais = entrada.nextDouble();
        //processamento
        tempo = (minutos/60)+hora;
        ganho = (tempo*reais);
        result = (ganho*0.7);
        total = (ganho+result);
        //saida
        System.out.println("Você ganhou com os 70%:"+total+"R$ a mais pela suas horas trabalhadas");
        
        
                

    }
    
}
