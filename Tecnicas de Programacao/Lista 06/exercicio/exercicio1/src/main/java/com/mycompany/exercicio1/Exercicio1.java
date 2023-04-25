/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio1;
import javax.swing.JOptionPane;

/**
 *
 * @author labs
 */
public class Exercicio1 
{

    public static void main(String[] args) 
    {
        boolean sair = false;
        int operacao = 0;
        double valor = 0;
        
        Conta conta = new Conta();
        
        while(true)
        {
            String a = "";
            
            try 
            {
                a = JOptionPane.showInputDialog(null, "Digite a operacao: \r\n"
                                                    + "1 - sacar \r\n"
                                                    + "2 - depositar \r\n"
                                                    + "3 - saldo \r\n"
                                                    + "4 - atualizar baseado na taxa \r\n"
                                                    + "9 - sair ");
                operacao = Integer.parseInt(a);

                switch (operacao)
                {
                    case 1: 
                    {   
                        a = JOptionPane.showInputDialog(null, "Digite o valor do saque: ");
                        valor = Double.parseDouble(a);

                        if(true == conta.sacar(valor))
                        {
                            JOptionPane.showMessageDialog(null,"Saque realizado com sucesso!", "Sucesso",1);                        
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Saldo insuficiente!", "Falha no saque",1);
                        }

                        break;                    
                    }

                    case 2:
                    {
                        a = JOptionPane.showInputDialog(null, "Digite o valor do deposito: ");
                        valor = Double.parseDouble(a);

                        conta.depositar(valor);

                        JOptionPane.showMessageDialog(null,"Depósito realizado com sucesso!", "Sucesso",1);
                        break;                      
                    }

                    case 3:
                    {
                        double saldo = conta.getSaldo();

                        JOptionPane.showMessageDialog(null,"Saldo atual: " + saldo, "Sucesso",1);                    

                        break;
                    }
                    
                    case 4:
                    {
                        a = JOptionPane.showInputDialog(null, "Digite o valor da taxa: min = -100; max = +100");
                        valor = Double.parseDouble(a);
                        
                        if(true == conta.Atualiza_valor(valor))
                        {
                            JOptionPane.showMessageDialog(null,"Saldo atualizado com sucesso", "Sucesso",1);                             
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Falha ao atualizar saldo", "Falha",1); 
                        }

                        break;
                    }
                                        
                    case 9:
                    {
                        sair = true;
                        break;
                    }                    

                    default:
                    {
                        JOptionPane.showMessageDialog(null,"Opcao invalida!", "Falha no saque",1);                             
                    }                
                }
                
                if(true == sair)
                {
                    break;                    
                }                
            } 
            catch (NumberFormatException e)
            {                
                JOptionPane.showMessageDialog(null,"O dado tem que ser apenas numerico !", "ERRO: ",1);                   
            }            
        }
    }
    
    public static class Conta
    {
        private double saldo;

        public void Conta() 
        {
            this.saldo = 0;
        }

        public double depositar(double valor)
        {
            this.saldo += valor;            
            return this.saldo;
        }
        
        public boolean sacar(double valor)
        {
            if(this.saldo >= valor)
            {
                this.saldo -= valor;
                return true;                
            }
            
            return false;
        } 
        
        public boolean Atualiza_valor(double taxa)
        {
            if((taxa > 100) || (taxa < -100))
            {
                return false;
            }            
            
            double percentual = Math.abs(taxa / 100);            
            double valor = this.saldo * percentual;            
                          
            if(taxa > 0)
            {
                this.saldo += valor;
            }
            else
            {
                this.saldo -= valor;                
            }

            return true;            
        }        
        
        public double getSaldo() 
        {
            return saldo;
        }        
    }    
}
