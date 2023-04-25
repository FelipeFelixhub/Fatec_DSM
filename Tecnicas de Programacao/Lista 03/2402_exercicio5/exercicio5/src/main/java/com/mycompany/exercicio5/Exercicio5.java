/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio5;
import javax.swing.JOptionPane;

/**
 *
5)Criar um programa que leia um número que será o limite superior de um intervalo e o incremento. 
* Exibir todos os números naturais no intervalo de 0 até esse número.  
* Suponha que os dois números lidos são maiores que zero.
 */
public class Exercicio5 {

    public static void main(String[] args) 
    {
        String a;
        int maximo, incremento;
            
        try 
        {
            a = JOptionPane.showInputDialog(null,"Digite o valor máximo");
            maximo = Integer.parseInt(a);
            
            a = JOptionPane.showInputDialog(null,"Digite o incremento");
            incremento = Integer.parseInt(a);
            
            System.out.printf("Valores entre o intervalor de 0 ate %d: ", maximo);
            
            int i = 0;
            
            while(i <= maximo)
            {
                System.out.printf("%d ", i);
                i += incremento;                
            }
                           
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"O dado tem que ser apenas numerico !", "ERRO: ",1);
        }       
    }
}
