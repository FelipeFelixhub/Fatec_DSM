package exercicio5;

import javax.swing.JOptionPane;

/**
 * 
 5º)  Depois  da  liberação  do  governo  para  as  mensalidades  dos  planos  de  saúde,
 as pessoas começaram a fazer pesquisas para descobrir um bom plano, não muito caro.
 Um vendedor de um plano de saúde apresentou a tabela a seguir. 
 Criar um programa que entre com o nome e a idade de uma pessoa e mostre o valor que ela deverá pagar.
 
 Até 10 anos –R$ 30,00
 Acima de 10 até 29 anos –R$ 60,00
 Acima de 29 até 45 anos –R$ 120,00
 Acima de 45 até 59 anos –R$ 150,00
 Acima de 59 até 65 anos –R$ 250,00
 Maior que 65 anos –R$ 400,00
 
 *
 */

public class Exercicio5 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog(null,"Digite seu nome: ", "Plano de saúde", JOptionPane.INFORMATION_MESSAGE);
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade: ","Plano de saúde", JOptionPane.INFORMATION_MESSAGE));
		
		double valor = 0;
		
		if (idade < 10) {
			valor = 30.00;
		} else if (idade >= 10 && idade < 29) {
			valor = 60.00;
		} else if (idade >= 29 && idade < 45) {
			valor = 120.00;
		} else if (idade >= 45 && idade < 59) {
			valor = 150.00;
		} else if (idade >= 59 && idade < 65) {
			valor = 250.00;
		} else if(idade >=65) {
			valor = 400.00;
		}
		
		JOptionPane.showMessageDialog(null,"Nome: " + nome + "\nIdade: " + idade + "\nValor: " + valor, "Plano de saúde", JOptionPane.INFORMATION_MESSAGE);
		
	}
}
	