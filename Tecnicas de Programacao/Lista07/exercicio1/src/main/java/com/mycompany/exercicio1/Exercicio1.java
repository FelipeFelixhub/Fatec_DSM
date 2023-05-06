/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int cod = 0;
        
        
      try{
        
        System.out.println("Insira o codigo do produto:");
        cod = sc.nextInt();
 
        }catch(InputMismatchException e){  
            System.out.println("Formato invalido");
        }
      
        System.out.println("Digite a descricao do item:");
        String desc = sc.next();
        
        System.out.println("Digite o preco unitario do item:");
        double precoUni = sc.nextDouble();
        
        System.out.println("Digite a quantidade:");
        int quant = sc.nextInt();
        
       
        Faturar faturar = new Faturar(cod, desc, quant, precoUni);
        
        System.out.println("Descricao do item: " + faturar.getDescricao());
        System.out.println("Quantidade: " + faturar.getQuantidade());
        System.out.println("Preco Unitario: " + faturar.getPrecoUnitario());
        System.out.println("Valor Total: " + faturar.getFaturarTotal());
        
        
        
        sc.close();
                
        
    }
}
