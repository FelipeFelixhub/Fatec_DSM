/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany._exercicio1;

import javax.swing.JOptionPane;

/**
 *
01 -)Um  programa  capaz  de  imprimir  todos  os  números  pares  em  um  intervalo de números informador pelo usuário;
 */
public class App {

    public static void main(String[] args) {
        
        int num1, num2;
        
        String a, b;
        
        try 
        {
            a = JOptionPane.showInputDialog(null, "Digite o menor numero");
            num1 = Integer.parseInt(a);

            b = JOptionPane.showInputDialog(null, "Digite o maior numero");
            num2 = Integer.parseInt(b);

            System.out.println("O numeros do intervalos sâo: ");

            for(int i = num1; i <= num2 ; i++ ) 
            {
                if( (i % 2) == 0  ) 
                {
                    System.out.printf("%d ", i);

                }

            }
        
        } 
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"O dado tem que ser apenas numerico !", "ERRO: ",1);
        
        }
   }
   
}
