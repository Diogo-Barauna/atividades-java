package atividades;

import java.util.Scanner;

public class Atividade9 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantas horas você trabalhou esse mês?");
		int horas = scan.nextInt();
		System.out.println("Quanto você recebe por hora?");
		int sal = scan.nextInt();
		double total = sal * horas;
		double extra = 0;
		if (horas > 160) {
			extra = sal * ( horas - 160) * 0.5;
			total += extra;
		}
		
		System.out.println("Seu salário total do mês foi R$" + total);
		
		scan.close();
	}
}
