package módulo01.operadores;

import javax.swing.JOptionPane;

//https://pt2.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13?from_action=save

public class Exercício_01_04 {
	
		
/*	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in) ;
		
		System.out.println("Digite a primeira nota :");
		
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota :");
		
		double nota2 = scan.nextDouble();
		
		System.out.println("Digite a terceira nota :");
		
		double nota3 = scan.nextDouble();
		
		System.out.println("Digite a quarta nota :");
		
		double nota4 = scan.nextDouble();
		
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4 ;
		
		System.out.println("A média das notas é :" + media);
			
	}*/
		
		public static void main(String[] args) {
		
			String nota1String = JOptionPane.showInputDialog("Digite a primeira nota bimestral :");
			
			double nota1Double = Double.parseDouble(nota1String);
			
	        String nota2String = JOptionPane.showInputDialog("Digite a segunda nota bimestral :");
			
			double nota2Double = Double.parseDouble(nota2String);
			
			String nota3String = JOptionPane.showInputDialog("Digite a terceira nota bimestral :");
			
			double nota3Double = Double.parseDouble(nota3String);	
			
			String nota4String = JOptionPane.showInputDialog("Digite a quarta nota bimestral :");
			
			double nota4Double = Double.parseDouble(nota4String);			
			
			double media = (nota1Double + nota2Double + nota3Double + nota4Double) /4 ;
			
			JOptionPane.showConfirmDialog(null, "A média das notas é :" + media);
		
		}		

}
