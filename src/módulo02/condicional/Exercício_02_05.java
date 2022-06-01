package módulo02.condicional;
//https://pt2.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

import java.util.Scanner;

public class Exercício_02_05 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a nota parcial 1 :");
		
		double nota1 = scan.nextDouble();
		
        System.out.println("Digite a nota parcial 2 :");
		
		double nota2 = scan.nextDouble();
		
		double media = ((nota1 + nota2)/ 2) ; 
		
		if ( media == 10 ){
			
			System.out.println("Aprovado com Distinção");
			
		}
		
		else {
			
			if ( media >= 7){
				
				System.out.println("Aprovado");
				
			}
			
			else {
				
				System.out.println("Reprovado");
			}
		}				
	}
}
