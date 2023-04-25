/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio5;
import javax.swing.JOptionPane;

/**
 *
5) Num determinado Estado, para transferências de veículos, o DETRAN cobra uma 
* taxa de 1% para carros fabricados antes de 1990 e uma taxa de 1.5% para os 
* fabricados de 1990 em diante, taxa esta incidindo sobre o valor de tabela 
* do carro. O projeto deve ler o ano e o preço do carro e a seguir calcular 
* e exibir o imposto a ser pago, através de uma função que retorne valor.
 */
public class Exercicio5 
{
    public static float CalcValor(int ano, float valor)
    {
        if(ano < 1990)
        {
            return (float)(valor * (float)0.010);            
        }

        return (float)(valor * (float)0.015);        
    }    
    
    public static void main(String[] args) 
    {
        try
        {
            String Ano = JOptionPane.showInputDialog(null,"Ano do veiculo: ");
            String Valor = JOptionPane.showInputDialog(null,"Valor do veiculo: ");
        
            int AnoInt = Integer.parseInt(Ano);
            float ValorInt = Float.parseFloat(Valor);        
        
            float imposto = CalcValor(AnoInt, ValorInt);
            
            JOptionPane.showMessageDialog(null,"Valor imposto = R$ " + imposto);        
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"Entrada inválida");            
        }
    }
}
