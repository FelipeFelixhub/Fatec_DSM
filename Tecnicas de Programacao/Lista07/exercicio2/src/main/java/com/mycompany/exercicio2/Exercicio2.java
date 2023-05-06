/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
     try {   
        System.out.println("Insira o nome do primeiro funcionario :");
        String nome1 = sc.next();
        
        System.out.println("Insira o sobrenome do primeiro funcionario:");
        String sobrenome1 = sc.next();
        
        System.out.println("Insira o Salario mensal do primeiro funcionario:");
        double salario1 = sc.nextDouble();
        
        System.out.println("Insira o nome do segundo funcionario:");
        String nome2 = sc.next();
        
        System.out.println("Insira o sobrenome do segundo funcionario:");
        String sobrenome2 = sc.next();
        
        System.out.println("Insira o Salario mensal do segundo funcionario:");
        double salario2 = sc.nextDouble();
        
        Empregado emp1 = new Empregado(nome1,sobrenome1,salario1);
        Empregado emp2 = new Empregado(nome2,sobrenome2,salario2);
        
       
        System.out.println("---------------------------------------------------------");
        
        System.out.println("Empregado 1: " + emp1.getNome() + " " + emp1.getSobrenome());
        System.out.println("Salario Anual: " + emp1.salarioAnual());
        System.out.println("Salario com aumento de 10 porcento: " + emp1.aumento());
        
        
        System.out.println("---------------------------------------------------------");
        
        
        System.out.println("Empregado 2: " + emp2.getNome() + " " + emp2.getSobrenome());
        System.out.println("Salario Anual: " + emp2.salarioAnual());
        System.out.println("Salario com aumento de 10 porcento: " + emp2.aumento());
        
     } catch (Exception e) {
         System.out.println("Erro ao inserir os dados");
     }
     finally{
        
        sc.close();
    }
   }  
}
