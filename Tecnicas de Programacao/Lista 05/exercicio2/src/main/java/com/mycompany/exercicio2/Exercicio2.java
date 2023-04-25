/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio2;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class Exercicio2 
{

    public static void main(String[] args) 
    {
        equacao Equacao = new equacao();        
        
        try 
        {
            String A = JOptionPane.showInputDialog(null,"Digite o A: ");
            int Aint = Integer.parseInt(A);
            
            String B = JOptionPane.showInputDialog(null,"Digite o B: ");
            int Bint = Integer.parseInt(B);
            
            String C = JOptionPane.showInputDialog(null,"Digite o C: ");
            int Cint = Integer.parseInt(C);              
            
            Equacao.calcRaizes(Aint, Bint, Cint);
            
            JOptionPane.showMessageDialog(null,"A = " + Equacao.A + 
                                               "; B = " + Equacao.B +
                                               "; C = " + Equacao.C + 
                                               "; R1 = " + Equacao.R1 +  
                                               "; R2 = " + Equacao.R2);
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"Entrada Invalida");        
        }
    }
    
    public static class equacao
    {
        private int A;
        private int B;
        private int C;
        
        private float R1;
        private float R2;
        
        public void equacao()
        {
            this.A = 0;
            this.B = 0;
            this.C = 0;
        }
        
        public int get_A()
        {
            return this.A;
        }   
        
        public int get_B()
        {
            return this.B;
        }
        
        public int get_C()
        {
            return this.C;
        }
        
        public float get_R1()
        {
            return this.R1;
        }
        
        public float get_R2()
        {
            return this.R2;
        }           
        
        public void calcRaizes(int A, int B, int C)
        {
            this.A = A;
            this.B = B;
            this.C = C;
            
            float delta = (float)((B * B) - 4 * A * C);            
            this.R1 = (float)(-B + Math.sqrt(delta)) / (2 * A);
            this.R2 = (float)(-B - Math.sqrt(delta)) / (2 * A);
        }        
    }    
}
