package módulo02.condicional;

import java.util.Scanner;

import javax.swing.JOptionPane;

//https://pt2.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

public class Exercício_02_02 {
	
	public static void main(String[] args) {
		
		String numS = JOptionPane.showInputDialog("Digite um número :");
		
		double numD = Double.parseDouble(numS);
		
		if (numD < 0) {
			
			System.out.println("O número digitado é negativo");
		}
		
		else {
			
			if (numD == 0 ){
				
				System.out.println("O número digitado é zero");
					
			}
			
			else {
				
				System.out.println("O número digitado é positivo");
				
			}
		}		
	}		
}
