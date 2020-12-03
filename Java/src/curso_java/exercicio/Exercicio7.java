package curso_java.exercicio;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String lixo;
		int opcao1menu = 0;
		String[] produto = new String[2];
		int[] qtdade = new int[2];
		
		
		
		
		
		while (opcao1menu != 4) {
		
			System.out.println("--------------------------------");
			System.out.println("         MERCADO DA LA�S");
			System.out.println("--------------------------------");
			System.out.println("1 - Cadastrar produtos | 2 - Fazer pedido | 3 - Inserir produto no estoque | 4 - Sair");
			
			opcao1menu = sc.nextInt();
			switch (opcao1menu) {
			case 1:
				
				for (int i = 0; i < 2; i++) {
					System.out.println("Informe o nome do produto:");
					lixo = sc.nextLine();
					produto[i] = sc.nextLine();
					System.out.println("Informe a quantidade do produto:");
					qtdade[i] = sc.nextInt();
				}
				
				break;
			case 2:
				
				System.out.println("-------------------------------");
				System.out.println("       LISTA DE PRODUTOS");
				System.out.println("-------------------------------");
				for (int i = 0; i < qtdade.length; i++) {
					System.out.println("C�d. produto: "+i+" | Nome do produto: "+produto[i]+" | Estoque: "+qtdade[i]);
					
				}
				System.out.println("Informe o c�digo do produto:");
				int codProd = sc.nextInt();
				System.out.println("Informe a quantidade que voc� quer comprar:");
				int qtdadecompra = sc.nextInt();

				for (int i = 0; i < qtdade.length; i++) {
					if (qtdade[i] == codProd) {
						
						if (qtdadecompra <= qtdade[i]) {
							qtdade[i] = qtdade[i]-qtdadecompra;
						}else {
							System.out.println("Quantidade indispon�vel no estoque!");
						}
						
					}else if (qtdade[i] != codProd) {
						System.out.println("Produto n�o existe!");
					} 
				}
				
				
				break;
			default:
				break;
			}
		}

		

			
	}

}
