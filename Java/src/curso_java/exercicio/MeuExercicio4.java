package curso_java.exercicio;

import java.util.Scanner;

public class MeuExercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		float saldo = 0;
		
		do {
			System.out.println("__________________________");
			System.out.println("	 BANCO DA LAIS");
			System.out.println("__________________________");
			System.out.println("-----------MENU-----------");
			System.out.println("1 - CONSULTA SALDO");
			System.out.println("2 - SAQUE");
			System.out.println("3 - DEPOSITO NA SUA CONTA");
			System.out.println("4 - SAIR");
			System.out.println("___________________________");
			opcao = sc.nextInt();			
			switch (opcao) {
			case 1:
				System.out.println("Seu saldo é de: "+saldo);
				break;
			case 2:
				System.out.println("Informe o valor de saque:");
				float valorSaque = sc.nextFloat();
				
				if (valorSaque <= saldo) {
					saldo = saldo-valorSaque;
					System.out.println("Saque efetuado com sucesso!");
				}else {
					System.out.println("O seu saldo é de: R$"+saldo+" ... Você não pode sacar esse valor.");				
				}				
				break;
			case 3:
				System.out.println("Informe o valor para depósito:");
				float valorDeposito = sc.nextFloat();
				saldo = saldo+valorDeposito;
				System.out.println("Depósito efetuado com sucesso! Seu saldo agora é de: R$"+ saldo);
				break;
			case 4:
				System.out.println("Você saiu!");
				break;			
			default:
				System.out.println("Opção inválida!");
				break;
			}			
		} while (opcao <= 4);		
	}
}
