/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio3;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class Exercicio3 
{
    public static void main(String[] args) 
    {
        pessoa Pessoa1 = new pessoa();   
        pessoa Pessoa2 = new pessoa();
                
        try 
        {
            Pessoa1.nome = "Albert Einstein";
            Pessoa1.ajustaDataDeNascimento(14, 03, 1879);            
            Pessoa1.calculaIdade();
            
            JOptionPane.showMessageDialog(null,"Nome: " + Pessoa1.informaNome() +   
                                               "; idade: " + Pessoa1.informaIdade());
            
            Pessoa2.nome = "Isaac Newton";
            Pessoa2.ajustaDataDeNascimento(04, 01, 1643);            
            Pessoa2.calculaIdade();
            
            JOptionPane.showMessageDialog(null,"Nome: " + Pessoa2.informaNome() +   
                                               "; idade: " + Pessoa2.informaIdade());        
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"Entrada Invalida");        
        }            
    }
    
    public static class pessoa
    {
        private String nome; 
        private int dia;
        private int mes;
        private int ano;
        private int idade;      
        
        public void pessoa()
        {
            this.nome = "";
            
            this.dia = 0;
            this.mes = 0;
            this.ano = 0;            
            this.idade = 0;
        }
        
        public void calculaIdade()
        {
            int nascDia = this.dia;
            int nascMes = this.mes;
            int nascAno = this.ano;
            
            int hojeDia = 21;
            int hojeMes = 03;
            int hojeAno = 2023;
            
            int idadeParcial = hojeAno - nascAno - 1;
            
            if(hojeMes > nascMes) 
            {
                idadeParcial++;                
            }                
            else if(nascMes == hojeMes)
            {
                if(nascDia <= hojeDia)
                {
                    idadeParcial++;
                }                
            }
            
            this.idade = idadeParcial;
        }   
        
        public int informaIdade()
        {
            return this.idade;
        }
        
        public String informaNome()
        {
            return this.nome;
        }
        
        public void ajustaDataDeNascimento(int dia, int mes, int ano)
        {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;            
        }    
    }
}
