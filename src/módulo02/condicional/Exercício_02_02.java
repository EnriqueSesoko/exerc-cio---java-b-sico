package m�dulo02.condicional;

import java.util.Scanner;

import javax.swing.JOptionPane;

//https://pt2.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

public class Exerc�cio_02_02 {
	
	public static void main(String[] args) {
		
		String numS = JOptionPane.showInputDialog("Digite um n�mero :");
		
		double numD = Double.parseDouble(numS);
		
		if (numD < 0) {
			
			System.out.println("O n�mero digitado � negativo");
		}
		
		else {
			
			if (numD == 0 ){
				
				System.out.println("O n�mero digitado � zero");
					
			}
			
			else {
				
				System.out.println("O n�mero digitado � positivo");
				
			}
		}		
	}		
}
