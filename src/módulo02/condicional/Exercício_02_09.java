package módulo02.condicional;

import java.util.Scanner;

import javax.swing.JOptionPane;

//https://pt2.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15


public class Exercício_02_09 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro número : ");
		
		double n1 = scan.nextDouble();
		
		System.out.println(" O número digitado foi : " + n1);
		
        System.out.println("Digite o segundo número : ");
		
		double n2 = scan.nextDouble();
		
		System.out.println(" O número digitado foi : " + n2);
		
        System.out.println("Digite o terceiro número : ");
		
		double n3 = scan.nextDouble();
		
		System.out.println(" O número digitado foi : " + n3);
		
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
