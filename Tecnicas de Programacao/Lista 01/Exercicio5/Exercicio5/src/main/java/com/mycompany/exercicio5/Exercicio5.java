/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/*
5. Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a
fórmula:
VOLUME = 3.14159 * R2 * ALTURA
*/


package com.mycompany.exercicio5;
import java.util.Scanner;


/**
 *
 * @author labs
 */
public class Exercicio5 
{    
    public static void main(String[] args) 
    {
        double volume, raio, altura;        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor raio");
        raio = input.nextDouble();
        System.out.println("Digite a altura");
        altura = input.nextDouble();        
        
        volume = raio * raio * altura * 3.14159;        
        
        System.out.printf("Volume = %2.2f m^3", volume);
    }
}
