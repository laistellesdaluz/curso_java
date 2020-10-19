package curso_java.selecao.exemplo;

import java.util.Scanner;

public class Exemplo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("__________________________");
		System.out.println("	AUTO ESCOLA JAVA");
		System.out.println("__________________________");
		System.out.println("-----------MENU-----------");
		System.out.println("1 - APTO A DIRIGIR");
		System.out.println("2 - TURMAS DISPONÍVEIS");
		System.out.println("___________________________");
		int menu = Integer.parseInt(sc.nextLine());
		
		switch (menu) {
		case 1:
			System.out.println("Informe seu nome:");
			String nome = sc.nextLine();
			
			System.out.println("Informe sua idade:");
			int idade = Integer.parseInt(sc.nextLine());
			
			System.out.println("Você sabe dirigir? S/N");
			String sabeDirigir = sc.nextLine();
			
			System.out.println("Você é familiar do Dono da Autoescola? S/N");
			String ehParente = sc.nextLine();
			
			if ((idade >= 18 && sabeDirigir.equalsIgnoreCase("S")) || (ehParente.equalsIgnoreCase("S"))) {
				System.out.println(nome+", você está apto(a) para dirigir!");
			}else {
				System.out.println(nome+", você não está apto(a) para dirigir.");
			}			
			break;
		case 2:
			System.out.println("Quantas pessoas vão estudar nessa turma?");
			int qtdade = sc.nextInt();
			
			if (qtdade <= 2) {
				System.out.println("Há vagas");
			}else {
				System.out.println("Não há vagas!");
			}
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}		
	}
}
