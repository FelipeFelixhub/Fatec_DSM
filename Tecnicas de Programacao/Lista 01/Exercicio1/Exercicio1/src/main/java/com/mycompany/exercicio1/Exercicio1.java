/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/*
1. Em época de pouco dinheiro, os comerciantes estão procurando aumentar suas
vendas oferecendo desconto. Faça um programa que possa entrar com o nome
de um produto e seu valor unitário e calcular e exibir um novo valor com um
desconto de 9%
*/

package com.mycompany.exercicio1;
import java.util.Scanner;

/**
 *
 * @author labs
 */
public class Exercicio1 
{
    public static void main(String[] args) 
    {
        String Nome;
        float Valor;        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o nome do produto");
        Nome = input.nextLine();
        System.out.println("Digite o valor do produto");
        Valor = input.nextFloat();
        Valor *= 0.9;
        
        System.out.printf("Produto: %s\nValor com desconto: R$%.2f \n", Nome, Valor);        
    }
}
