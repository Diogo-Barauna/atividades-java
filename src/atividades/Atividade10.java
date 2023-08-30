package atividades;

import java.util.Scanner;

public class Atividade10 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Qual é o seu salário fixo?");
        double sal = scan.nextDouble(); 
        System.out.println("Quantos reais em vendas foram efetuadas?");
        double vendas = scan.nextDouble(); 
        double total = sal;

        if (vendas <= 1500) {
            total += vendas * 0.03; 
        } else {
            total += 1500 * 0.03; 
            total += (vendas - 1500) * 0.05; 
        }

        System.out.println("Seu salário total do mês foi R$" + total);

        scan.close();
	}
}
