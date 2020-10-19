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
		System.out.println("2 - TURMAS DISPON�VEIS");
		System.out.println("___________________________");
		int menu = Integer.parseInt(sc.nextLine());
		
		switch (menu) {
		case 1:
			System.out.println("Informe seu nome:");
			String nome = sc.nextLine();
			
			System.out.println("Informe sua idade:");
			int idade = Integer.parseInt(sc.nextLine());
			
			System.out.println("Voc� sabe dirigir? S/N");
			String sabeDirigir = sc.nextLine();
			
			System.out.println("Voc� � familiar do Dono da Autoescola? S/N");
			String ehParente = sc.nextLine();
			
			if ((idade >= 18 && sabeDirigir.equalsIgnoreCase("S")) || (ehParente.equalsIgnoreCase("S"))) {
				System.out.println(nome+", voc� est� apto(a) para dirigir!");
			}else {
				System.out.println(nome+", voc� n�o est� apto(a) para dirigir.");
			}			
			break;
		case 2:
			System.out.println("Quantas pessoas v�o estudar nessa turma?");
			int qtdade = sc.nextInt();
			
			if (qtdade <= 2) {
				System.out.println("H� vagas");
			}else {
				System.out.println("N�o h� vagas!");
			}
			break;
		default:
			System.out.println("Op��o inv�lida!");
			break;
		}		
	}
}
