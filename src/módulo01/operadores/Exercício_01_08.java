package módulo01.operadores;

import javax.swing.JOptionPane;

//https://pt2.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13?from_action=save

public class Exercício_01_08 {
	
	public static void main(String[] args) {
		
		String salarioHoraS = JOptionPane.showInputDialog("Digite quantos reais ganha por hora :");
		
		double salarioHoraD = Double.parseDouble(salarioHoraS);
		
		String horasTrabalhadasS = JOptionPane.showInputDialog("Digite quantos reais ganha por hora :");
		
		double horasTrabalhadasD = Double.parseDouble(horasTrabalhadasS);
		
		double salarioFinal ;
		
		salarioFinal = horasTrabalhadasD * salarioHoraD ; 
		
		JOptionPane.showMessageDialog(null, "O seu salário é de : "+ salarioFinal + " reais");
				
	}

}
