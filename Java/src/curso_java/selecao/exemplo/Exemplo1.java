package curso_java.selecao.exemplo;

import java.util.Scanner;

public class Exemplo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lanches JAVA");
		
		System.out.println("Voc� ganha desconto da Proway? S/N");
		String descontoProway = sc.nextLine();
		
		System.out.println("Vai querer o prato do dia? S/N");
		String pratoDoDia = sc.nextLine();
		
		if (pratoDoDia.equalsIgnoreCase("S")) {
			System.out.println("Desconto do Prato do Dia");
		}else if (descontoProway.equalsIgnoreCase("S")) {
			System.out.println("Desconto da Proway");
		}else {
			System.out.println("Sem desconto");
		}
		sc.close();
	}
}
