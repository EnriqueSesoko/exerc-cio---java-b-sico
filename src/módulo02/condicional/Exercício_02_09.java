package m�dulo02.condicional;

import java.util.Scanner;

import javax.swing.JOptionPane;

//https://pt2.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15


public class Exerc�cio_02_09 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero : ");
		
		double n1 = scan.nextDouble();
		
		System.out.println(" O n�mero digitado foi : " + n1);
		
        System.out.println("Digite o segundo n�mero : ");
		
		double n2 = scan.nextDouble();
		
		System.out.println(" O n�mero digitado foi : " + n2);
		
        System.out.println("Digite o terceiro n�mero : ");
		
		double n3 = scan.nextDouble();
		
		System.out.println(" O n�mero digitado foi : " + n3);
		
		if ( n1 > n2 ){		
			
			if ( n1 > n3 ){	
				
				if ( n2 > n3 ){				
					System.out.println(n1 + " , " + n2 + " , " + n3);				
				}
				
				else {
					System.out.println(n1 + " , " + n3 + " , " + n2);
				}
			}
			
			else {
				
				if (n1 > n2){
					
					System.out.println(n3 + " , " + n1 + " , " + n2);
					
				}
				else {
					
					System.out.println(n3 + " , " + n2 + " , " + n1);
				}

			}			
		}	
		
		else {			
			if ( n1 > n3 ){				
				System.out.println(n2 + " , " + n1 + " , " + n3);			
			}
			else {			
				System.out.println(n2 + " , " + n3 + " , " + n1);	
			}			
		}		
	}	

}
