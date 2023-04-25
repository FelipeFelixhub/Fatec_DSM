package exercicio2;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * 
 2º) Ler três números e mostrá-los em ordem crescente.
 *
 */
public class Exercicio2 {

	public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i < 4; i++) {
                list.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " + i + "° valor:", "Valores", JOptionPane.QUESTION_MESSAGE)));
        }

        list.sort(null);

        JOptionPane.showMessageDialog(null, list);
    }
}
