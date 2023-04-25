/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/*
3. Faça um programa que leia dois valores e informe a média entre eles. (use float
como tipo de dado).

*/

package com.mycompany.exercicio3;
import java.util.Scanner;

/**
 *
 * @author labs
 */
public class Exercicio3 
{
    public static void main(String[] args) 
    {
        float valor1, valor2, media;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor 1");
        valor1 = input.nextFloat();
        System.out.println("Digite o valor 1");
        valor2 = input.nextFloat();
        
        media = (valor1 + valor2) / 2;
        
        System.out.printf("Valor da media= %.2f", media);
    }
}
