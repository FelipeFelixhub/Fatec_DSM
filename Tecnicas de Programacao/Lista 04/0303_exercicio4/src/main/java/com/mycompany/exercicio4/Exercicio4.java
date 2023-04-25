/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio4;
import javax.swing.JOptionPane;

/**
 *
4) Calcule o peso ideal de uma pessoa através de uma função que não retorne valor. 
* Dados de entrada: altura e sexo. Fórmulas para cálculo do peso:
peso ideal de homem = (72,7 x altura) - 58
peso ideal da mulher = (62,1 x altura) - 44,7
 */
public class Exercicio4 {

    public static float calcPeso(float altura, String sexo)
    {
        float pesoIdeal = 0;
        
        if(sexo.equals("M"))
        {
            return ((float)(72.7 * altura) - 58);            
        }
        else
        {
            return ((float)(62.1 * altura) - (float)44.7);            
        }        
    }
    
    public static void main(String[] args) 
    {
        String Sexo = JOptionPane.showInputDialog(null,"Sexo [M = Masculino, F = Feminino ");
        Sexo = Sexo.toUpperCase();
        
        if((Sexo.equals("M")) || (Sexo.equals("F")))
        {              
            try             
            {
                String Altura = JOptionPane.showInputDialog(null,"Digite a altura: ");
                float floatAltura = Float.parseFloat(Altura);   
            
                JOptionPane.showMessageDialog(null,"Peso ideal = " + calcPeso(floatAltura, Sexo));
            }
            catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null,"Altura inválida");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Sexo inválido");        
        }        
    }
}
