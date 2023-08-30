package atividades;

import java.util.Scanner;

public class Atividade3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double valor;
		System.out.println("Quantas maçãs deseja comprar?");
		int quantidade = scan.nextInt();
		if (quantidade < 12) {
			valor = quantidade * 1.30;
		} else {
			valor = quantidade * 1.00;
		}
		System.out.println("O valor total deu R$" + valor);
		scan.close();
	}
	
}
