package módulo01.operadores;

import java.util.Scanner;
//https://pt2.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13?from_action=save

public class Exercício_01_14 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		// MB = MegaByte 
		
		System.out.println("Digite o tamanho do arquivo em MB :");
				
		double tamanho = scan.nextDouble();
		
		// Mbps = MegaBit por segundo
		
		// 1 byte = 8 bits
		
		System.out.println("Digite a velocidade da rede em Mbps :");
		
		double velocidade = scan.nextDouble();
		
		double tempoSegundos = ((8 * tamanho )/ velocidade) ;
		
		double tempoMinutos = (tempoSegundos / 60) ;
		
		System.out.println("O tempo levado para baixar o arquivo é de :" + tempoMinutos + " minutos");
		
	}

}
