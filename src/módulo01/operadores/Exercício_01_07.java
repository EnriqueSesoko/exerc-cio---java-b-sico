package m�dulo01.operadores;

import java.util.Scanner;

//https://pt2.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13?from_action=save

public class Exerc�cio_01_07 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o lado do quadrado :");
		
		double lado = scan.nextDouble();
		
		double area = 4 * lado ;
		
		System.out.println("A �rea do quadrado � :" + area);
		
		double areaDobro = area * 2 ; 
		
		System.out.println("O dobro da �rea do quadrado � :" + areaDobro );
			
	}

}
