/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio1;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class Exercicio1 
{

    public static void main(String[] args) 
    {
        triangulo Trian = new triangulo();
        
        try 
        {
            String base = JOptionPane.showInputDialog(null,"Digite a base: ");
            int baseInt = Integer.parseInt(base);
            
            String altura = JOptionPane.showInputDialog(null,"Digite a altura: ");
            int alturaInt = Integer.parseInt(altura);              
            
            Trian.calc_triangulo(baseInt, alturaInt);
            
            JOptionPane.showMessageDialog(null,"base = " + Trian.base + 
                                               "; altura = " + Trian.altura +
                                               "; area = " + Trian.area);
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"Entrada Invalida");        
        }
    }
    
    public static class triangulo
    {
        private int base;
        private int altura;
        private float area;
        
        public void triangulo()
        {
            this.base = 0;
            this.altura = 0;
        }
        
        public int get_base()
        {
            return this.base;
        }
        
        public int get_altura()
        {
            return this.altura;
        }
        
        public float get_area()
        {
            return this.area;
        }
        
        public float calc_triangulo(int base, int altura)
        {
            this.base = base;
            this.altura = altura;            
            this.area = (float)((base * altura) / 2);
            
            return this.area;
        }        
    }    
}
