package m�dulo02.condicional;

import java.util.Scanner;

//https://pt2.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

public class Exerc�cio_02_03 {
	
/*	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Digite o sexo, sendo  M :masculino ou F :femenino :");
		
		String sexoS = scan.next() ;
		
		char sexoC = sexoS.charAt(0);
		
		if ( sexoC == 'F') {
			
			System.out.println("O sexo � femenino");
			
		}
		
		else {
			
			if (sexoC == 'M') {
				
				System.out.println("O sexo � masculino :");
			}
			
			else {
				
				System.out.println("Sexo inv�lido");
				
			}
		}		
	}*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Digite o sexo, sendo  M :masculino ou F :femenino :");
		
		String sexo = scan.next() ;
		
		if ( sexo.equalsIgnoreCase("f")) {
			
			System.out.println("O sexo � femenino");
			
		}
		
		else {
			
			if (sexo.equalsIgnoreCase("m")) {
				
				System.out.println("O sexo � masculino :");
			}
			
			else {
				
				System.out.println("Sexo inv�lido");
				
			}
		}		
	}
	
/*	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Digite o sexo, sendo  M :masculino ou F :femenino :");
		
		String sexo = scan.next() ;
		
		if ( sexo.equals("F")) {
			
			System.out.println("O sexo � femenino");
			
		}
		
		else {
			
			if ( sexo.equals("M")) {
				
				System.out.println("O sexo � masculino :");
			}
			
			else {
				
				System.out.println("Sexo inv�lido");
				
			}
		}		
	}*/
}
