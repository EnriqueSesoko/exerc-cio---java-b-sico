package módulo02.condicional;

import java.util.Scanner;

//https://pt2.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

public class Exercício_02_01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in) ;
		
		System.out.println("Digite um número :");
		
		double num1 = scan.nextDouble() ;
		
		System.out.println("Digite um outro número :");
		
		double num2 = scan.nextDouble() ;
		
		if (num1 < num2) {
			
			System.out.println("O maior número é : " + num2);
		}
		
		else {
			
			if (num1 > num2 ){
				
				System.out.println("O maior número é : " + num1 );
					
			}
			
			else {
				
				System.out.println("Os números são iguais :" + num1);
				
			}
		}		
	}
}
