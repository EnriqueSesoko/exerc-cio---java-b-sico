package módulo01.operadores;

import java.util.Scanner;


//https://pt2.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13?from_action=save

public class Exercício_01_09 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite uma temperatura em Farenheit :");
		
		double tempFarenheit = scan.nextDouble() ;
		
		double tempCelsius = (5 * (tempFarenheit - 32) / 9) ;
		
		System.out.println("A temperatura em Celsius é :" + tempCelsius + " graus celsius");
	
	}

}
