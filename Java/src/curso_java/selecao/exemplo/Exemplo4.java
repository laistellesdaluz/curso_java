package curso_java.selecao.exemplo;

import java.util.Scanner;

public class Exemplo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opcao = "";
		String preto = "caf� preto";
		String branco = "caf� com leite";
				
		do {
			System.out.println("____________________");
			System.out.println("----CAF� DA LA�S----");
			System.out.println("____________________");
			System.out.println("P - Preto");
			System.out.println("B - Branco");
			System.out.println("C - Chocolate");
			System.out.println("S - Sair");
			opcao = sc.nextLine();
		} while (!opcao.equalsIgnoreCase("S"));
		
		switch (opcao) {
		case "P":
			
			break;
			
		case "B":

			break;
		case "C":
			
			break;
		default:
			break;
		}
	}
}
