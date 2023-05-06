/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio4;


import java.util.Scanner;

/**
 *
 * @author labs
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try{
        System.out.println("**DATA**");
        System.out.println("Informe o dia: ");
        int dia = sc.nextInt();
        
        System.out.println("Informe o mes: ");
        int mes = sc.nextInt();
        
        System.out.println("Informe o ano: ");
        int ano = sc.nextInt();
        
        Data data = new Data(mes, dia, ano);
        
        System.out.println("**DATA**" );
        System.out.println(data.toString());
        
        }catch(Exception e){
            System.out.println("ERRO!: Formato invalido");
        }
        
        finally{
            
        }
        
        sc.close();
    }
}
