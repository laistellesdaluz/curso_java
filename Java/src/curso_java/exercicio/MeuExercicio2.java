package curso_java.exercicio;

import java.util.Scanner;

public class MeuExercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		loop: while (true) {
			System.out.println("CALCULADORA DA LAIS");
			System.out.println("Informe o primeiro valor:");
			int primeiroValor = sc.nextInt();

			System.out.println("Informe o segundo valor:");
			int segundoValor = sc.nextInt();
			System.out.println("Informe uma das opera��es:");
			System.out.println("1 - Somar | 2 - Subtrair | 3 - Multiplicar | 4 - Dividir | 5 - Sair");
			int operacao = sc.nextInt();
			double resultado = 0;

			switch (operacao) {
			case 1:
				resultado = primeiroValor + segundoValor;
				System.out.println("O resultado da adi��o �: " + resultado);
				System.out.println("");
				continue;
			case 2:
				resultado = primeiroValor - segundoValor;
				System.out.println("O resultado da subtra��o �: " + resultado);
				System.out.println("");
				continue;
			case 3:
				resultado = primeiroValor * segundoValor;
				System.out.println("O resultado da multiplica��o �: " + resultado);
				System.out.println("");
				continue;
			case 4:
				resultado = primeiroValor / segundoValor;
				System.out.println("O resultado da divis�o �: " + resultado);
				System.out.println("");
				continue;
			case 5:
				break loop;
			default:
				System.out.println("Op��o inv�lida!");
				continue;
			}
			
		}
		


	}
}
