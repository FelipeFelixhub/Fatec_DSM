/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany._exercicio1;

import javax.swing.JOptionPane;

/**
1) Ler o  nome  de  um  produto,  o  preço  e  a  quantidade  comprada.  Escreva  o  nome  do 
produto comprado e o valor total a ser pago, considerando que são oferecidos descontos 
pelo número de unidades compradas, segundo a tabela abaixo:

a) Até 10 unidades: valor total
b) De 11 a 20 unidades: 10% de desconto
c) De 21 a 50 unidades: 20% de desconto
d) Acima de 50 unidades: 25% de desconto
Calcular o valor total a ser pago através de uma função que retorna valor.
 */
public class App {
    
    public static double valorFinal ( double price, int quant) 
    {
        if (quant <= 10 )
        {
            return price * quant;
        }
        else if ( quant <= 20 )
        {
            return price * quant * 0.9;
                     
        }
        else if (quant <= 50) 
        {
            return price * quant * 0.8;
        }
        else{
            return price * quant * 0.75;
        }
    }

    public static void main(String[] args) {
        
        double price, valorFinal;
        int quant;
        
        
        String x = JOptionPane.showInputDialog(null,"Nome do produto: ");
        String y = JOptionPane.showInputDialog(null,"Preco do produto: ");
        String z = JOptionPane.showInputDialog(null,"Informe a quantidade: ");
        
        price = Double.parseDouble(y);
        quant = Integer.parseInt(z);
        
            
        JOptionPane.showMessageDialog(null,"Produto:  " + x + " Valor: " + valorFinal(price, quant) ,"Total",
        JOptionPane.INFORMATION_MESSAGE);
        
    }
}
