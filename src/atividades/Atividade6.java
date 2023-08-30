package atividades;

import java.util.Scanner;

public class Atividade6 {
	
	public static void main(String[] args) {
		int maior = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número");
		int n1= scan.nextInt();
		System.out.println("Digite outro número");
		int n2 = scan.nextInt();
		if (n1 > n2) {
			maior = n1;
		} else {
			maior = n2;
		} 
		System.out.println("O maior número é: " + maior);
		scan.close();
	}
}
