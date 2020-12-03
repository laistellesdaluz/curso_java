package OrientacaoObjeto;

import java.util.Scanner;

public class UsarJogoDaVelha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		JogoDaVelha jogodaVelha = new JogoDaVelha();
		
		System.out.println("Jogador 1 = X ");
		System.out.println("Jogador 2 = O ");
		
		boolean ganhou = false;
		char sinal;
		int linha = 0, coluna = 0;
		
		while (!ganhou) {
			if (jogodaVelha.vezJogador1()) {
				System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3)");
				sinal = 'X';
			}else {
				System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3)");
				sinal = 'O';
			}
			linha = valor("Linha", sc);
			coluna = valor("Coluna", sc);
			
			if (!jogodaVelha.validarJogada(linha, coluna, sinal)) {
				System.out.println("Posi��o j� usada, tente novamente");
			}
			jogodaVelha.imprimirTabuleiro();
			
			if (jogodaVelha.verificarGanhador('X')) {
				ganhou = true;
				System.out.println("Parab�ns, jogador 2 ganhou!");
			}else if (jogodaVelha.verificarGanhador('O')) {
				ganhou = true;
				System.out.println("Parab�ns, jogador 2 ganhou!");
			}else if (jogodaVelha.getJogada() > 9) {
				ganhou = true;
				System.out.println("Ningu�m ganhou esta partida!");
			}
			
		}

	}
	
	static int valor(String tipoValor, Scanner sc) {
		int valor = 0;
		boolean valorValida = false;
		while (!valorValida) {
			System.out.println("Entre com a: "+tipoValor+" (1, 2 ou 3)");
			valor = sc.nextInt();
			if (valor >=1 && valor <=3) {
				valorValida = true;
			}else {
				System.out.println("Entrada inv�lida, tente novamente");
			}
		}
		valor--;
		return valor;
	}

}
