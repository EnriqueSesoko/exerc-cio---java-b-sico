package m�dulo01.operadores;

import java.util.Scanner;

import javax.swing.JOptionPane;

//https://pt2.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13?from_action=save

public class Exerc�cio_01_03 {
	
/*	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in) ;
		
		System.out.println("Digite um n�mero :");
		
		double num1 = scan.nextDouble();
		
		System.out.println("Digite outro n�mero :");
		
		double num2 = scan.nextDouble();
		
		double soma = (num1 + num2) ;
		
		System.out.println("A soma dos n�meros � :" + soma);
			
	}*/
	
	public static void main(String[] args) {
		
		String num1String = JOptionPane.showInputDialog("Digite um n�mero :");
		
		double num1Double = Double.parseDouble(num1String);
		
        String num2String = JOptionPane.showInputDialog("Digite outro n�mero :");
		
		double num2Double = Double.parseDouble(num2String);
		
		double soma = (num1Double + num2Double) ;
		
		JOptionPane.showConfirmDialog(null, "A soma dos n�meros � :" + soma);
	
	}

}
