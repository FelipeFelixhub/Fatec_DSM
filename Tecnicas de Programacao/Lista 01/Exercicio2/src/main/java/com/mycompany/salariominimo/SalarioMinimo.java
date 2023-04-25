/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.salariominimo;

import java.util.Scanner;

/**
 *
 * @author labs
 */
public class SalarioMinimo {

    public static void main(String[] args) {
        double salarioMinimo = 1300, salario, calculo;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu salario:");
        salario = input.nextDouble();
        calculo = salario / salarioMinimo;
        System.out.printf("\nCalculo = %2f",calculo);
     
        
                
        
    }
}
