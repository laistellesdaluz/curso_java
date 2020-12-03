package Metodos;

import java.util.Scanner;

public class MainContaCorrente {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String lixo;
		int opcao= 0;
		int vip = 0;
		
		ContaCorrente contaCorrente = new ContaCorrente();
		
		System.out.println("---------------------------");
		System.out.println("      BANCO DA LAÍS");
		System.out.println("---------------------------");
		System.out.println("Informe o número da conta para cadastrar:");
		contaCorrente.numeroConta = sc.nextInt();
		System.out.println("Informe o número da agência para cadastrar:");
		contaCorrente.agencia = sc.nextInt();
		System.out.println("Informe o nome do titular da conta para cadastrar:");
		lixo = sc.nextLine();
		contaCorrente.nomeTitular = sc.nextLine();
		System.out.println("Informe o limite de saque da conta para cadastrar:");
		contaCorrente.limiteSaque = sc.nextDouble();
		contaCorrente.saldo = 0;
		do {
			System.out.println("Informe 1 - Se o cliente for Status VIP | Informe 2 - Se o cliente não for VIP");
			vip = sc.nextInt();
			if (vip == 1) {
				contaCorrente.statusVIP = true;			
			}else {
				if (vip == 2) {
					contaCorrente.statusVIP = false;
				}else {
					System.out.println("Opção inválida.");
				}
			}
			
		} while ((vip != 1) && (vip != 2));
		

		
		do {
			System.out.println("-----------------------");
			System.out.println("     MENU DO BANCO");
			System.out.println("-----------------------");
			System.out.println("1 - REALIZAR SAQUE | 2 - DEPÓSITO | 3 - CONSULTAR SALDO | 4 - AUMENTAR LIMITE DE SAQUE | 5 - FECHAR PROGRAMA");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Valor para saque:");
				double valorSaque = sc.nextDouble();
				contaCorrente.realizarSaque(valorSaque);
				break;
			case 2:
				System.out.println("Valor para depósito:");
				double valorDeposito = sc.nextDouble();
				contaCorrente.deposito(valorDeposito);
				break;
			case 3:
				contaCorrente.consultaSaldo();
				break;
			case 4:
				if (contaCorrente.statusVIP = true) {
					System.out.println("Informe o novo limite de saque:");
					double valorAumento = sc.nextDouble();
					contaCorrente.aumentarLimite(valorAumento);
					
				}else {
					System.out.println("Opção disponível apenas para clientes VIP");
				}
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}			
		} while ((opcao >= 1) || (opcao <= 5));
		
		

		

	}
}
