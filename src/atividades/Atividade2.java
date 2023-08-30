package atividades;

import java.util.Scanner;

public class Atividade2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número");
		int num = scan.nextInt();
		if (num < 0) {
			System.out.println("Valor negativo");
		} else {
			System.out.println("Valor positivo");
		}
		scan.close();
	}
	
}
