package m�dulo01.operadores;

import java.util.Scanner;

//https://pt2.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13?from_action=save

public class Exerc�cio_01_11 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um n�mero inteiro :");
		
		int numInt1 = scan.nextInt();
		
		System.out.println("Digite um outro n�mero inteiro :");		
		
		int numInt2 = scan.nextInt();
		
		System.out.println("Digite um n�mero real  :");				
		
		double numDouble3 = scan.nextDouble();
		
		double produto = (2 * numInt1) * (numInt2 / 2); 
		
		System.out.println("a. O produto do dobro do primeiro pela metade do segundo � :" + produto);
		
		double soma = ((3 * numInt1 ) + numDouble3 ) ;
		
		System.out.println("b. A soma do triplo do primeiro com o terceiro � :" + soma);
		
		double cubo = Math.pow(numDouble3, 3) ;
		
		System.out.println("c. O cubo do terceiro � :" + cubo);
		
	}

}
