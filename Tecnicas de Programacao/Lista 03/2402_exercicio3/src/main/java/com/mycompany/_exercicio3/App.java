/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany._exercicio3;

import javax.swing.JOptionPane;

/**
 *
 3)Um  programa  capaz  de  imprimir  todos  os  números  primos  em  um  intervalo  de números informado pelo usuário
 */
public class App {

    public static void main(String[] args) 
    {        
        int menor, maior;
        boolean primo = false;
        String a, b;
        
        try 
        {
            a = JOptionPane.showInputDialog(null,"Informe o numero menor: ");
            menor = Integer.parseInt(a);

            b = JOptionPane.showInputDialog(null,"Digite o numero maior: ");
            maior = Integer.parseInt(b);
            
            System.out.println("Numeros primos: ");
            
            for(int i = menor; i <= maior; i++) 
            {
                primo = false;
                
                for(int j = 2; j <= i; j++)
                {
                    if((i % j) == 0)
                    {
                        if(i == j) 
                        {
                            primo = true;
                        }
                        else
                        {
                            primo = false;
                            break;                            
                        }
                    }                                
                }
                
                if(primo == true)
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
