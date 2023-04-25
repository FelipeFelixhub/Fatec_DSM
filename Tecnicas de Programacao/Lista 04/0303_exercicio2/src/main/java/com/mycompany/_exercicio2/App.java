/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany._exercicio2;

import javax.swing.JOptionPane;
/**
 2) Ler número  da  conta  do  cliente,  saldo,  débito e  crédito.
 * Após,  calcular  e  escrever  o saldo  atual  (saldo  atual  =  saldo -débito  +  crédito),  através  de  uma  função  que  retorne valor,
 * também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.
 */
public class App {
    
    public static double saldoAtual(double saldoInicial, double debito, double credito ) 
    {
        double sf = saldoInicial - debito + credito;
        if ( sf >= 0)
        {
             JOptionPane.showMessageDialog(null,"Saldo Positivo");
        } else 
        {
            JOptionPane.showMessageDialog(null,"Saldo Negativo");
        }
        
        
        
        return saldoInicial - debito + credito;        
    }
    
    public static void main(String[] args) {
        
        double saldoInicial, debito, credito;
        
        
        
        String w = JOptionPane.showInputDialog(null,"Informe o numero da conta: ");
        String x = JOptionPane.showInputDialog(null,"Informe o saldo da conta: ");
        String y = JOptionPane.showInputDialog(null,"Informe debitos: ");
        String z = JOptionPane.showInputDialog(null,"Informe creditos : ");
        
        saldoInicial = Double.parseDouble(x);
        debito = Double.parseDouble(y);
        credito = Double.parseDouble(z);
        
            
        JOptionPane.showMessageDialog(null,"Conta:  " 
        + w + "\nSaldo atual: " 
        + String.format("%.2f",saldoAtual(saldoInicial, debito, credito)) ,"Saldo",
        JOptionPane.INFORMATION_MESSAGE);
        
    }
}
