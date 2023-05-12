/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio02;

import javax.swing.JFrame;
/**
 *

 * 
 * Elabore  um  frame  que  simule  o teclado  de um  telefone  digital,  de acordo com  a Figura.A cada tecla pressionada o númeroé acumulado  
 * na caixa de texto. O botão Limpar  apaga todos os números  digitados.
 * 
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Telefone telefone = new Telefone();
        telefone.setSize(170, 225);        
        telefone.setResizable(false);
        telefone.setLocationRelativeTo(null);
        telefone.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telefone.setVisible(true);
    }
}