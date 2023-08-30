package atividades;

import java.util.Scanner;

public class Atividade8 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hora de inicio");
		int inicio = scan.nextInt();
		System.out.println("Hora do fim");
		int fim = scan.nextInt();
		int total = fim - inicio;
		if (inicio > fim) {
			total = (inicio - 12) - (fim + 12);
		}	
		
		total = Math.abs(total);
		
		System.out.println("A duração do jogo em horas foi: " + (total) + "H");
		
		scan.close();
	}
}
