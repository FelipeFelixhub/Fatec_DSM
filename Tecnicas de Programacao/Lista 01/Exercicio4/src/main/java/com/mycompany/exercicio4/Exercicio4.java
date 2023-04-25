/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio4;

import java.util.Scanner;

/**
 *
 * @author labs
 */
public class Exercicio4 {

    public static void main(String[] args) {
        int celcius, conversao;
        
        Scanner input = new Scanner (System.in);
        System.out.println("Digite a temperatura em graus C ");
        celcius = input.nextInt();
        conversao = (9 * celcius + 160) / 5;
        System.out.printf("\nTemperatura em Fahrenheit: %d", conversao);
       
        
    }
}
