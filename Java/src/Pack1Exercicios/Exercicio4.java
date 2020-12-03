package Pack1Exercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------");
		System.out.println("    CALCULADORA DE MDC");
		System.out.println("---------------------------");
		System.out.println("Informe o primeiro número:");
		int primeiroNumero = Integer.parseInt(sc.nextLine());
		System.out.println("Informe o segundo número:");
		int segundoNumero = Integer.parseInt(sc.nextLine());
		
		int resto = 0;
		
//		if (primeiroNumero < segundoNumero) {
//			resto = primeiroNumero;
//			primeiroNumero = segundoNumero;
//			segundoNumero = resto;
//		}
		
		resto = primeiroNumero % segundoNumero;
		
		while (resto != 0) {
			primeiroNumero = segundoNumero;
			segundoNumero = resto;
			resto = primeiroNumero % segundoNumero;			
		}
		System.out.println("O MDC é: "+segundoNumero);
	}
}
