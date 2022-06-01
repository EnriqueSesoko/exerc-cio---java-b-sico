package módulo02.condicional;

import javax.swing.JOptionPane;

//https://pt2.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15


public class Exercício_02_10 {
	
	public static void main(String[] args) {
		
		String letra = JOptionPane.showInputDialog("Por favor, digite M - para Matutino ,  V - para Vespertino ou N - para Noturno :");
		
		switch (letra) {
		
		case  "M" : JOptionPane.showMessageDialog(null,"Bom Dia !"); break;
		case  "V" : JOptionPane.showMessageDialog(null,"Boa Tarde !"); break;
		case  "N" : JOptionPane.showMessageDialog(null,"Boa Noite !"); break;
		default : JOptionPane.showMessageDialog(null,"Valor Inválido !");
		
		}
	}

}
