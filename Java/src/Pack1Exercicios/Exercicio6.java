package Pack1Exercicios;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome = "";
		int idade = 999;
		double salario = 0;
		char sexo = 'a';
		char estadoCivil = 'a';
		
		while (nome.length() <= 3) {
			System.out.println("Informe um nome com mais de 3 caracteres:");
			nome = sc.nextLine();						
		}
		
		while (idade > 150) {
			System.out.println("Informe uma idade entre 0 e 150:");
			idade = Integer.parseInt(sc.nextLine());						
		}	
		
		while (salario < 0) {
			System.out.println("Informe o salário maior que zero:");
			salario = Double.parseDouble(sc.nextLine());						
		}	
		
		while (!(sexo == 'f') || (sexo == 'm') || (sexo == 'o')) {
			System.out.println("Informe o sexo com 'f','m' ou 'o':");
			sexo = sc.next(".").charAt(0);						
		}	
		
		while (!(estadoCivil == 's') || (estadoCivil == 'c') || (estadoCivil == 'd') || (estadoCivil == 'v')) {
			System.out.println("Informe seu estado civil com 's', 'c', 'd' ou 'v':");
			estadoCivil = sc.next(".").charAt(0);						
		}

		System.out.println("Parabéns! Você chegou até o final!!");
	}
}
