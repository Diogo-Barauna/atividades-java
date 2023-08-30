package atividades;

import java.util.Scanner;

public class Atividade1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número");
		int num = scan.nextInt();
		if (num < 10) {
			System.out.println("Não é maior que 10");
		} else {
			System.out.println("É maior ou igual a 10");
		}
		if (num < 0) {
			System.out.println("Valor negativo");
		} else {
			System.out.println("Valor positivo");
		}
		scan.close();
		
		
		
	}
	
}
