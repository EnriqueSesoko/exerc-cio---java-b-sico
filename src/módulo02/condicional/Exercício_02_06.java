package módulo02.condicional;
//https://pt2.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

import javax.swing.JOptionPane;

public class Exercício_02_06 {
	
	public static void main(String[] args) {
				
		String n1S = JOptionPane.showInputDialog("Digite o primeiro numero :") ;
		
		double n1 = Double.parseDouble(n1S);
		
        String n2S = JOptionPane.showInputDialog("Digite o segundo numero :") ;
		
		double n2 = Double.parseDouble(n2S);
		
        String n3S = JOptionPane.showInputDialog("Digite o terceiro numero :") ;
		
		double n3 = Double.parseDouble(n3S);
		
		if ( n1 > n2 ){	
			
			if ( n1 > n3 ){				
				JOptionPane.showConfirmDialog(null, n1);
			}
			else {
				JOptionPane.showConfirmDialog(null, n3);
			}			
		}		
		else {			
			if ( n2 > n3 ){				
				JOptionPane.showConfirmDialog(null, n2);			
			}
			else {			
				JOptionPane.showConfirmDialog(null, n3);
			}			
		}		
	}
}
