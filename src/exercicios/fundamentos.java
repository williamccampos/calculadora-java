package exercicios;

import javax.swing.JOptionPane;

public class fundamentos {
	
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro n�mero:");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo n�mero");
		
		int num1 = Integer.parseInt(valor1);
		int num2 = Integer.parseInt(valor2);
		int soma = num1 + num2;
		int media = soma / 2;
		int quadrado = soma * 2;
		int cubo = soma * 3;
		JOptionPane.showConfirmDialog(null, "A soma � " + soma + "\r\n" + "A m�dia � " + media + "\r\n" + 
		"Elevado ao quadrado � " + quadrado + "\r\n" + "Elevado ao cubo � " + cubo + "\r\n" + "Obrigado por usar =D");
	}

}
