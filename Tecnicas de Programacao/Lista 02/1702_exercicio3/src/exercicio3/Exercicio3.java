package exercicio3;

import javax.swing.JOptionPane;

/**
 * 
 3º) Umcomerciante comprou um produto e quer vendê-lo com um lucro de 45% se o valor  da  compra  for menor  que  R$20,00;
  caso  contrário,  o  lucro  será de 30%.  Entrar com o valor do produto e imprimir o valor da venda. 
 *
 */

public class Exercicio3 {

	public static void main(String[] args) {
		String vendaString = JOptionPane.showInputDialog("Insira o valor da venda: ");
		
		double venda = Double.parseDouble(vendaString);
		double valorFinal = 0;
		
		if (venda < 20.00) {
			valorFinal = venda * 1.45;
		} else {
			valorFinal = venda * 1.30 ;
		}
		
		JOptionPane.showMessageDialog(null,"Valor Final da Venda: " + valorFinal);

	}

}
