
package velmedia;

import java.util.Scanner;


public class Velmedia {

    
    public static void main(String[] args) {
    double percurso, hora, minuto, tempo, velmedia; 
    Scanner entrada = new Scanner (System.in);
    System.out.println("Digite o percurso");
    percurso=entrada.nextDouble();
    System.out.println("Digite apenas a hora");
    hora = entrada.nextDouble();
    System.out.println ("Digite o minuto");
    minuto = entrada.nextDouble();
    tempo = (minuto/60)+hora;
    velmedia = percurso/tempo;
    System.out.println ("A veocidade desse carro era de "+velmedia+ "Km/h");
    
    
}
