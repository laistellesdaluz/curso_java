package curso_java.orientacao_objetos;

import java.util.Scanner;

public class meuPrimeiroOAO {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String retorno = ", você tem ";
		String nome = new meuPrimeiroOAO().perguntaNome();
		
		while (true) {			
			try {
				int idade = new meuPrimeiroOAO().perguntaIdade();
				retorno = nome+retorno+idade+ " anos."; 
				break;
				
			} catch (Exception e) {
				System.out.println("Testen de novo...");
			}
			
		}
		System.out.println(retorno);
	}



	private static String perguntaNome() {
		String nome = "";
		System.out.println("Informe seu nome:");
		nome = sc.nextLine();
		return nome;	
	}

	private static int perguntaIdade() {
		int idade = 0;
		System.out.println("Informe sua idade:");
		idade = Integer.parseInt(sc.nextLine());
		return idade;
	}
}
