package módulo01.operadores;

import javax.swing.JOptionPane;

//https://pt2.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13?from_action=save

public class Exercício_01_13 {
	
	public static void main(String[] args) {
		
		String salarioHoraS = JOptionPane.showInputDialog("Digite quantos reais ganha por hora :");
		
		double salarioHoraD = Double.parseDouble(salarioHoraS);
		
		String horasTrabalhadasS = JOptionPane.showInputDialog("Digite quantos reais ganha por hora :");
		
		double horasTrabalhadasD = Double.parseDouble(horasTrabalhadasS);
		
		double salarioBruto = horasTrabalhadasD * salarioHoraD ; 
		
		JOptionPane.showMessageDialog(null, "a. O seu salário bruto é de : "+ salarioBruto + " reais");
		
		double INSS = (0.08 * salarioBruto) ;
		
		JOptionPane.showMessageDialog(null, "b. O INSS foi de : "+ INSS + " reais");
		
		double sindicato = (0.05 * salarioBruto);
		
		JOptionPane.showMessageDialog(null, "c. Pagou para o sindicato o valor de : "+ sindicato + " reais");

		double impostoDeRenda = (0.11 * salarioBruto);	
		
		double salarioLiq = (salarioBruto - (impostoDeRenda + INSS + sindicato));
		
		JOptionPane.showMessageDialog(null, "O salário líquido é de : " + salarioLiq + " reais");
		
	}
	

}
