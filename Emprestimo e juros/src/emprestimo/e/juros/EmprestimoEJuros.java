
package emprestimo.e.juros;

import java.util.Scanner;


public class EmprestimoEJuros {

  
    public static void main(String[] args) {
        double  emp,taxa,result;
        int temp;
        Scanner entrada = new Scanner (System.in);
        System.out.println ("Quanto quer emprestado?: ");
        emp = entrada.nextDouble();
        System.out.println("Em quantos meses vai pagar?: ");
        temp = entrada.nextInt();
        taxa = 0.02;
        result = emp*(Math.pow((1+taxa),temp));
        System.out.println("Ao final de "+temp+ "meses, voce pagara: R$"+result+"reais");
        
    }
    
}
