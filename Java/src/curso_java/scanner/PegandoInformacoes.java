package curso_java.scanner;

import java.util.Scanner;


public class PegandoInformacoes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva seu nome:");
		String nome = sc.nextLine();
		System.out.println("Digite o ano do seu nascimento:");
		int ano = sc.nextInt();
		int idade = 2020 - ano;
		System.out.println("Você tem "+ idade + " anos! Que bb!!");
		
		sc.close();
		
		//System.out.println("Oi, "+ nome);
		//System.out.println("Tudo bem?");
		
//		System.out.println("Informe o primeiro valor:");
//		Integer valor1 = sc.nextInt();
//		System.out.println("Informe o segundo valor:");
//		Integer valor2 = sc.nextInt();
//		Integer resultado = valor1 + valor2;
		
//		if (resultado > 5) {
//			System.out.println("O resultado foi alto");
//		}else {
//			System.out.println("O resultado foi baixo");
//		}
//		System.out.println("O resultado é: "+ resultado);
		
				
	}

}
