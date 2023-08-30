package atividades;

import java.util.Scanner;

public class Atividade5 {
	
	public static void main(String[] args) {
		int idade;
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual o ano atual?");
		int ano= scan.nextInt();
		System.out.println("Em que ano você nasceu?");
		int nasc = scan.nextInt();
		idade = ano - nasc;
		if (idade < 16) {
			System.out.println("Você NÃO poderá votar esse ano!");
		} else {
			System.out.println("Você poderá votar esse ano!");
		}
		scan.close();
	}
	
}
