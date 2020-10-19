package curso_java.selecao.exemplo;

import java.util.Scanner;

public class Exemplo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;
		
		do {
			System.out.println("*******MENU*********");
			System.out.println("1 - Produto");
			System.out.println("2 - Pessoa");	
			System.out.println("3 - Sair");
			menu = sc.nextInt();
		} while (menu != 3);
		
		switch (menu) {
		case 1:
			System.out.println("Cadastro de produto");
			break;
		case 2:
			System.out.println("Cadastro de pessoa");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
		
	}
}
