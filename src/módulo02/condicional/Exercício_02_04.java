package módulo02.condicional;

import javax.swing.JOptionPane;

//https://pt2.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

public class Exercício_02_04 {
	
/*	public static void main(String[] args) {
		
		String letraS = JOptionPane.showInputDialog(null, "Digite somente uma letra :");
		
		char letraC = letraS.charAt(0) ;
		
		if ((letraC == 'A') || (letraC == 'a') || (letraC == 'B')|| (letraC == 'b')|| (letraC == 'C')|| (letraC == 'c')|| (letraC == 'D')|| (letraC == 'd')|| (letraC == 'e')|| (letraC == 'E')) {
		
			System.out.println("É uma vogal");
			
		}
		
		else {
			
			System.out.println("É uma consoante");
			
		}	
	}*/
	
/*	public static void main(String[] args) {
		
		String letra = JOptionPane.showInputDialog("Digite uma letra :");
		
		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			
			System.out.println("A letra digitada é uma vogal : " + letra);
	
		}
		
		else {
			
			System.out.println("A letra digitada é uma consoante : " + letra);
			
		}		
	}*/
	
	public static void main(String[] args) {
			
		String letra = JOptionPane.showInputDialog("Digite uma letra : ");
		
		// O método ".length" verifica a quantidade de letras digitadas
		
		if ( letra.length() > 1) {
			
			System.out.println( "Não é uma letra válida !");
			
		}
		
		else {
			
			switch ( letra ) {
			
			case "a" :
			case "e" :	
			case "i" :	
			case "o" :
			case "u" :
			case "A" :
			case "E" :	
			case "I" :	
			case "O" :
			case "U" : System.out.println("vogal"); break;
			
			default : System.out.println("consoante");
						
			}				
		}		
	}
}
