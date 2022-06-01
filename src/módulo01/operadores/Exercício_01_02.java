package módulo01.operadores;

import java.util.Scanner;

import javax.swing.JOptionPane;

//https://pt2.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13?from_action=save

public class Exercício_01_02 {
	
/*	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um número :");
		
		int numero = scan.nextInt();
		
		System.out.println("O número informado foi [ " + numero + " ]");
				
	}*/
	
	public static void main(String[] args) {
		
		String numeroString = JOptionPane.showInputDialog("Digite um número :");
		
		int numeroInt = Integer.parseInt(numeroString);
		
		JOptionPane.showMessageDialog(null, "O número informado foi [ " + numeroInt + " ]");
				
	}

}
