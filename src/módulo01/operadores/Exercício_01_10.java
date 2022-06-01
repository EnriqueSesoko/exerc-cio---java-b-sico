package módulo01.operadores;

import javax.swing.JOptionPane;

//https://pt2.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13?from_action=save

public class Exercício_01_10 {
	
	public static void main(String[] args) {
		
		String tempCelsiusS = JOptionPane.showInputDialog("Digite uma temperatura em Celsius :") ;
		
		double tempCelsiusD = Double.parseDouble(tempCelsiusS);
		
		double tempFarenheit = ((9 * tempCelsiusD / 5) + 32) ;
		
		JOptionPane.showMessageDialog(null, "A temperatura em Farenheit é de :" + tempFarenheit + " graus farenheit");
		
	}

}
