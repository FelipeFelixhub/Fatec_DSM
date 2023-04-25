/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio3;
import javax.swing.JOptionPane;

/** *
3) Dados três valores X, Y e Z, verificar se eles podem ser os comprimentos dos lados de um triângulo , 
* através de uma função que retorne valor, e, se forem verificar se é um triângulo equilátero, 
* isósceles ou escalenos.

 Se eles não formarem um triângulo, escrever a mensagem. Considere as seguintes propriedades:
    - O comprimento de cada lado em um triângulo é menor que a soma dos outros dois lados;
    - Equiláteros: tem os comprimentos dos três lados iguais;
    - Isósceles: tem os comprimentos de dois lados iguais;
    - escaleno: tem os comprimentos dos três lados diferentes.

* 
 */
public class Exercicio3 
{
    static boolean IsTriangle (int a, int b, int c)
    {
        if(((a + b) < c) || ((a + c) < b) || ((b + c) < a)) 
        {
            return false;            
        }
        
        return true;        
    }
    
    static int identifyTriangle(int a, int b, int c)
    {
        //Equilatero         
        if((a == b) && (b == c))
        {
            return 1;            
        }
        
        if((a == b) || (a == c) || (b == c))
        {
            return 2;
        }
        
        return 3;        
    }
        
    public static void main(String[] args) 
    {
        int intX, intY, intZ;
        
        String X = JOptionPane.showInputDialog(null,"Digite o lado A: ");
        String Y = JOptionPane.showInputDialog(null,"Digite o lado B: ");
        String Z = JOptionPane.showInputDialog(null,"Digite o lado C: ");
        
        intX = Integer.parseInt(X);
        intY = Integer.parseInt(Y);
        intZ = Integer.parseInt(Z);
        
        if(IsTriangle(intX, intY, intZ) == true)
        {
            int value = identifyTriangle(intX, intY, intZ);
            
            switch (value)
            {
                case 1: 
                    JOptionPane.showMessageDialog(null,"triangulo equilatero");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"triangulo isoceles");
                    break;
                case 3: 
                    JOptionPane.showMessageDialog(null,"triangulo escaleno");                
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"não eh um triangulo");            
        }
    }
}
