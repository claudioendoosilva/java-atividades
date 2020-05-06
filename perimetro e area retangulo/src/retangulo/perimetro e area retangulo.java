
package retangulo;

import java.util.Scanner;


public class Retangulo {

    
    public static void main(String[] args) {
        double area,perimetro,base,altura;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a base:");
        base = entrada.nextDouble();
        System.out.println("Digite a altura:");
        altura = entrada.nextDouble();
        
        area = base*altura;
        perimetro = (base*2)+(altura*2);
                
        System.out.println("A área do retângulo é: "+area);
        System.out.println("O perímetro do retângulo é: "+perimetro);
               
      
    }
    
}
