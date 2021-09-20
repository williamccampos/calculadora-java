package exercicios;

import javax.swing.JOptionPane;

public class fundamentos {
	
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro número:");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo número");
		
		int num1 = Integer.parseInt(valor1);
		int num2 = Integer.parseInt(valor2);
		int soma = num1 + num2;
		int media = soma / 2;
		int quadrado = soma * 2;
		int cubo = soma * 3;
		JOptionPane.showConfirmDialog(null, "A soma é " + soma + "\r\n" + "A média é " + media + "\r\n" + 
		"Elevado ao quadrado é " + quadrado + "\r\n" + "Elevado ao cubo é " + cubo + "\r\n" + "Obrigado por usar =D");
	}

}
