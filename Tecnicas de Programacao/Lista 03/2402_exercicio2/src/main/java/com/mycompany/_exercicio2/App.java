/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany._exercicio2;

import javax.swing.JOptionPane;
import jdk.jfr.Unsigned;

/**
 *
 2)Um  programa  que  imprima  até  o  “n”  termo  a  seqüênciade  Fibonacci.      Série: 1,1,2,3,5,8,13,21......
 */
public class App {

    public static void main(String[] args) {
        
        int num, termo1 = 0, termo2 = 1, proximoTermo;
        
        String n;
        
        try
        {
            n = JOptionPane.showInputDialog(null,"Informe a quantidade de termos : ");
            num = Integer.parseInt(n);
            
            System.out.println("A sequencia de Fibonacci de " + num + " termos e : ");
            
            
            for(int i = 0; i <= num; i++)
            {
                System.out.printf("%d ", termo1);
                proximoTermo = termo1 + termo2;
                termo1 = termo2;
                termo2 = proximoTermo;
            }
            
            
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"O dado tem que ser apenas numerico !", "ERRO: ",1);
              
                
        }
    }
}