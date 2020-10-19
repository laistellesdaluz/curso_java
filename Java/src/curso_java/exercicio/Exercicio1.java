package curso_java.exercicio;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual seu nome?");
		String nome = sc.nextLine();
		System.out.println("Qual sua idade?");
		int idade = sc.nextInt();
		
		if (idade >= 18) {
			System.out.println("Seja bem vindo(a), "+ nome);
		}else {
			System.out.println("Você não pode entrar, "+nome+", você só tem "+idade+" anos...");
		}
		sc.close();
	}
}
