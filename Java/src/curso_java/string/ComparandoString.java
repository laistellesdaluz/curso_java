package curso_java.string;

import java.util.Scanner;

public class ComparandoString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nomeCadastrado = "Laís";
		
		System.out.println("Escreva seu nome:");
		String nome = sc.nextLine();
		
		System.out.println("O nome existe? com equals: "+ (nomeCadastrado.equals(nome)));
		System.out.println("O nome existe? com equalsIgnoreCase: "+ (nomeCadastrado.equalsIgnoreCase(nome)));
		
		sc.close();
	}
}
