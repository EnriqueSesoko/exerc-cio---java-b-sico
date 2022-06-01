package módulo01.operadores;

import javax.swing.JOptionPane;

//https://pt2.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13?from_action=save

public class Exercício_01_06 {
	
	public static void main(String[] args) {
		
		String raioS = JOptionPane.showInputDialog("Digite o valor do raio :");
		
		double raioD = Double.parseDouble(raioS);
		
		double area = Math.PI * Math.pow(raioD, 2);
		
		JOptionPane.showConfirmDialog(null, "A sua área é :" + area);
	}

}
