package m�dulo01.operadores;

import java.util.Scanner;

//https://pt2.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13?from_action=save

public class Exerc�cio_01_05 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
			
		System.out.println("Digite uma medida em metros :");
		
		double medidaMetros = scan.nextDouble();
		
		double medidaCentimetros = medidaMetros * Math.pow(10,2) ;
		
		System.out.println("A medida em cent�metros equivale a : " + medidaCentimetros + "cm");
		
	}

}
