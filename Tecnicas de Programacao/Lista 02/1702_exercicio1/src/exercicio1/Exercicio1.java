package exercicio1;

import javax.swing.JOptionPane;

/**
 * 
 1º) Ler um valor e informar se ele é ou não múltiplo de 3
 *
 */

public class Exercicio1 {

	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Informe um numero: \n");
		int valor2 = Integer.parseInt(valor);
		
		if (valor2 % 3 == 0) {
			JOptionPane.showMessageDialog(null, "O valor é multiplo de 3");
		} else {
			JOptionPane.showMessageDialog(null,"O valor não é multiplo de 3");
		}

	}

}
