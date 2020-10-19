package curso_java.condicoes;

import java.util.Scanner;

public class ComparandoInformacoes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nomeCadastrado = "Laís";
		
		System.out.println("Escreva seu nome:");
		String nome = sc.nextLine();
		
		System.out.println("O nome existe? com equals");
		if (nomeCadastrado.equals(nome)) {
			System.out.println("Existe");
		}else {
			System.out.println("Não existe");
		}
		System.out.println("O nome existe? com equalsIgnoreCase");
		if (nomeCadastrado.equalsIgnoreCase(nome)) {
			System.out.println("Existe");
		}else {
			System.out.println("Não existe");
		}
		sc.close();
	}
}
