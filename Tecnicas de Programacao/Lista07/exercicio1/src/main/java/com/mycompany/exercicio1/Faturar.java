/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio1;
public class Faturar {
        
        private int quantidade;
        private int codItem;
        private String descricao;
        private double precoUnitario;
        
        public Faturar (){
            
        }
        
       
    public Faturar(int codItem, String descricao, int quantidade, double precoUnitario) {
        this.codItem = codItem;
        this.descricao = descricao;
        this.quantidade = quantidade > 0 ? quantidade: 0;                     
        this.precoUnitario = precoUnitario > 0 ? precoUnitario : 0;
    }    

    public int getCodItem() {
        return codItem;
    }

    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
         return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    
    public double getFaturarTotal(){
     return  quantidade * precoUnitario;   
    }

    
      
        
        
}
