/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany._exercicio4;
import javax.swing.JOptionPane;

/**
 *
4)Um programa que calcule a média de uma alunonos moldes da Fatec Zona SUL.
 */
public class App {

    public static void main(String[] args) 
    {
        String a;
        float nota1, nota2, nota3, notaFinal;
            
        try 
        {
            a = JOptionPane.showInputDialog(null,"Digite a nota P1");
            nota1 = Float.parseFloat(a);
            
            a = JOptionPane.showInputDialog(null,"Digite a nota P2");
            nota2 = Float.parseFloat(a);
            
            a = JOptionPane.showInputDialog(null,"Digite a nota de trabalho");
            nota3 = Float.parseFloat(a);
            
            notaFinal = (nota1 * (float)0.35) + (nota2 * (float)0.35) + (nota3 * (float)0.3);        
            
            String NotaString = String.format("%.2f", notaFinal);            
            JOptionPane.showMessageDialog(null,"A nota final = "+ NotaString, "Nota", 1);                
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"O dado tem que ser apenas numerico !", "ERRO: ",1);
        }       
        
        
    }
}
