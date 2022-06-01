package módulo01.operadores;

import javax.swing.JOptionPane;

//https://pt2.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13?from_action=save

public class Exercício_01_12 {
	
	public static void main(String[] args) {
		
		String alturaS = JOptionPane.showInputDialog("Digite a sua altura :");
		
		double alturaD = Double.parseDouble(alturaS);
		
		double pesoIdeal = ((72.7 * alturaD) - 58);
		
		JOptionPane.showMessageDialog(null, "O peso ideal é :" + pesoIdeal + " kilos");
			
	}

}
