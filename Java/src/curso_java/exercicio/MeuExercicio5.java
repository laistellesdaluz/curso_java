package curso_java.exercicio;

import java.util.Scanner;

public class MeuExercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		loop: while (true) {
			System.out.println("________________");
			System.out.println("  LOOP DA LAIS");
			System.out.println("________________");
			System.out.println("Informe seu nome:");
			String nome = sc.nextLine();
			System.out.println("Informe sua idade:");
			int idade = sc.nextInt();
			System.out.println("Escolha área você deseja trabalhar:");
			System.out.println("1 - Adm | 2 - Comércio | 3 - Tecnologia | 4 - Outro");
			int opcaoMenu = sc.nextInt();
			
			switch (opcaoMenu) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			default:
				break;
			}
			
		}
	}
}
