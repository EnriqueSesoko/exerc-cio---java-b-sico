package m�dulo02.condicional;

import java.util.Scanner;

//https://pt2.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

public class Exerc�cio_02_01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in) ;
		
		System.out.println("Digite um n�mero :");
		
		double num1 = scan.nextDouble() ;
		
		System.out.println("Digite um outro n�mero :");
		
		double num2 = scan.nextDouble() ;
		
		if (num1 < num2) {
			
			System.out.println("O maior n�mero � : " + num2);
		}
		
		else {
			
			if (num1 > num2 ){
				
				System.out.println("O maior n�mero � : " + num1 );
					
			}
			
			else {
				
				System.out.println("Os n�meros s�o iguais :" + num1);
				
			}
		}		
	}
}
