package curso_java.operadores;

import java.util.Scanner;

public class TesteOperadorLogico {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valorSorteado = 5;
		int idadeMinima = 18;

		System.out.println("Escolha um n�mero:");
		int numeroEscolhido = Integer.parseInt(sc.nextLine());

		System.out.println("Digite sua idade:");
		int idade = Integer.parseInt(sc.nextLine());

//		if (valorSorteado == numeroEscolhido && idade >= idadeMinima) {
//			System.out.println("Parab�ns! Ganhou um joinha!");
//		}else {
//			if (idade < 18) {
//				System.out.println("Voc� � de menor, hein! Espere seus 18 anos!");
//			}else {
//				System.out.println("O n�mero informado n�o � o correto! Eita!!");
//			}
//		}

		if (valorSorteado == numeroEscolhido && idade >= idadeMinima) {
			System.out.println("Parab�ns! Ganhou um joinha!");
		} else if (idade < 18) {
			System.out.println("Voc� � de menor, hein! Espere seus 18 anos!");
		} else {
			System.out.println("O n�mero informado n�o � o correto! Eita!!");
		}
	}

}
