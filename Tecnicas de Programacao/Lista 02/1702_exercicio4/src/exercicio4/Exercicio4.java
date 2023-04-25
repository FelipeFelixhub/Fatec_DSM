package exercicio4;

import javax.swing.JOptionPane;

/**
 * 
4º) Ler a  idade de uma pessoa e informar a suaclasse eleitoral:
Não-eleitor (abaixo de 16 anos)
Eleitor obrigatório(entre 18 e 65 anos)
Eleitor facultativo(entre 16 e 18 anos e maior de 65 anos
 *
 */
public class Exercicio4 {

	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade: ", "Votação",JOptionPane.INFORMATION_MESSAGE));
		
		if (idade < 16) {
			JOptionPane.showMessageDialog(null,"Não apto a votar!");
		} else if (idade >= 18 && idade < 65) {
			JOptionPane.showMessageDialog(null,"Voto obrigatório!");
		} else if (idade >= 65 || (idade >= 16 && idade < 18 )) {
			JOptionPane.showMessageDialog(null,"Voto facultativo!");
		}

	}

}
