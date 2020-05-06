
package aumento.em.porcentagem;

import java.util.Scanner;


public class AumentoEmPorcentagem {

    
    public static void main(String[] args) {
        double preco, resultado;
        String nome;    
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o nome do produto: ");
        nome = entrada.next();
        System.out.println("Digite o preço do produto: ");
        preco = entrada.nextDouble();
        resultado= (preco*1.65);
        System.out.println("Você vai vender o produto: "+nome+"por R$"+resultado);
    }
    
}
