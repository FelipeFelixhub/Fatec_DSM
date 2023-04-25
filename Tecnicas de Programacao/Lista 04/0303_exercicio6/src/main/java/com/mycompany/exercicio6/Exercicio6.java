/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio6;
import javax.swing.JOptionPane;

/**
 *
6) Escreva um programa para ler um valor e escrever a soma da sua tabuada de 1 até 10
Ex:
* Digite Numero
    5
    Soma da Tabuada = 275
 */

public class Exercicio6 
{
    public static int calcSoma(int numero)
    {
        int soma = 0;        
        
        for (int i = 1; i <= 10; i++) 
        {
            soma += (i * numero);            
        }
        
        return soma;        
    }
        
    public static void main(String[] args) 
    {
        try 
        {
            String Numero = JOptionPane.showInputDialog(null,"Digite o numero: ");
            int NumeroInt = Integer.parseInt(Numero); 
            
            JOptionPane.showMessageDialog(null,"Soma = " + calcSoma(NumeroInt));            
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"Entrada Invalida");        
        }
    }
}
