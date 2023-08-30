package atividades;

import java.util.Scanner;

public class Atividade4 {
	
	public static void main(String[] args) {
		int media;
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual a nota da primeira prova?");
		int n1= scan.nextInt();
		System.out.println("Qual a nota da segunda prova?");
		int n2 = scan.nextInt();
		media = ((n1 + n2) / 2);
		if (media < 6) {
			System.out.println("Você foi reprovado");
		} else {
			System.out.println("Você foi aprovado");
		};
		System.out.println("Sua média foi: " + media);
		scan.close();
	}
	
}
