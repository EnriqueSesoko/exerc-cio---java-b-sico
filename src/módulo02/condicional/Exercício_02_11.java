package módulo02.condicional;

import javax.swing.JOptionPane;

public class Exercício_02_11 {
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, " Inciaremos o ajuste no seu salário ");
		
		String salarioAtualS = JOptionPane.showInputDialog(" Digite o salário atual :");
		
		Double salarioAtual = Double.parseDouble(salarioAtualS);
		
		Double salarioAjustado ;
		
		Double valorRealAumento ;

		
		double i = 0 ; // o i representa o percentual (%) do aumento sobre o salário atual, em decimal
		
		if ( salarioAtual <= 280 ){
			
			i = 0.2 ;
			
			salarioAjustado = (salarioAtual + salarioAtual* i);
		}
		else {
			
			if (salarioAtual <= 700) {
				
				
				i = 0.15;
				 
				salarioAjustado = (salarioAtual + salarioAtual* i);
									
			}
			
			else {
				
				if (salarioAtual <= 1500){
					
					i = 0.1 ;
					
					salarioAjustado = (salarioAtual + salarioAtual* i);
					
				}
				
				else {
					
					i = 0.05 ;
							
					salarioAjustado = (salarioAtual + salarioAtual* i);
					
				}
			}
		}
		
		i = (i*100); // convertendo o percentual do decimal para porcentagem
		
		JOptionPane.showMessageDialog(null, " O salário atual é de "+ salarioAtual + " reais");
		
		JOptionPane.showMessageDialog(null, "O percentual do aumento foi de "+ i +" %") ;
		
		valorRealAumento = (salarioAjustado - salarioAtual);
		
		JOptionPane.showMessageDialog(null, "Houve um aumento no salário de "+valorRealAumento+" reais");
		
		JOptionPane.showMessageDialog(null, "O Valor final do salário após o reajuste foi de " + salarioAjustado+ " reais");
	
	}

}
