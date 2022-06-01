package módulo02.condicional;
//https://pt2.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

import javax.swing.JOptionPane;

public class Exercício_02_08 {
	
	public static void main(String[] args) {
		
		String Produto1S = JOptionPane.showInputDialog("Digite o preço do produto 1 :");
		
		String Produto2S = JOptionPane.showInputDialog("Digite o preço do produto 2 :");
		
		String Produto3S = JOptionPane.showInputDialog("Digite o preço do produto 3 :");
		
		double Produto1 = Double.parseDouble(Produto1S);
		
		double Produto2 = Double.parseDouble(Produto2S);
		
		double Produto3 = Double.parseDouble(Produto3S);
		
		if (Produto1 < Produto2 ){		
			if (Produto1 < Produto3 ){				
				JOptionPane.showMessageDialog(null, "Deve comprar o produto 1, pois ele é o mais barato");
			}			
			else {			
				if (Produto2 < Produto3){		
					JOptionPane.showMessageDialog(null, "Deve comprar o produto 2, pois ele é o mais barato");				
				}
				else {
					JOptionPane.showMessageDialog(null, "Deve comprar o produto 3, pois ele é o mais barato");
				}
			}		
		}
		else {
			if(Produto2 < Produto3 ){
				
				JOptionPane.showMessageDialog(null, "Deve comprar o produto 2, pois ele é o mais barato");							
			}
			else{
				JOptionPane.showMessageDialog(null, "Deve comprar o produto 3, pois ele é o mais barato");
			}
		}	
	}
}
