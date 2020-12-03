package Pack1Exercicios;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cadastre seu login:");
		String login = sc.nextLine();
		System.out.println("Cadastre sua senha:");
		String senha = sc.nextLine();
		
		String validaLogin = "";
		String validaSenha = "";
		boolean logou = false;
		
		do {
			System.out.println("--------------------------");
			System.out.println("    LOGIN DO SISTEMA");
			System.out.println("--------------------------");
			System.out.println("Informe seu login:");
			validaLogin = sc.next();
			System.out.println("Informe sua senha:");
			validaSenha = sc.next();
			
			if ((validaLogin.equals(login)) && (validaSenha.equals(senha))) {
				logou = true;				
			}else {
				logou = false;
			}			
			
		} while (!logou);
		
		System.out.println("Logado com sucesso!");
	}
}
