/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio3;

import java.util.Scanner;


public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        try{
        System.out.println("Informe o primeiro numero: ");
        double n1 = sc.nextDouble();
        
        System.out.println("Informe o segundo numero: ");
        double n2 = sc.nextDouble();
        
        System.out.println("Informe a operacao:  (+, -, *, /)") ;
        char op = sc.next().charAt(0);
        
        
        Calculadora calculo = new Calculadora(n1, n2, op);
        
        System.out.println("Resultado da operacao:");
        calculo.calcular();
        
        }catch(Exception e){
            System.out.println("ERRO! Formato invalido");
        }
        finally{
        
        
        
        sc.close();
        }
    }   
}