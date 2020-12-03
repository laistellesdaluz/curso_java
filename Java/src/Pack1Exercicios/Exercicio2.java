package Pack1Exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual vai ser o tamanho do seu array:");
		int tamanhoArray = Integer.parseInt(sc.nextLine());
		
		int[] vetorInteiro = new int[tamanhoArray];
		int soma = 0;
		
		for (int i = 0; i < tamanhoArray; i++) {
			System.out.println("Informe o "+(i+1)+"º número:");
			vetorInteiro[i] = Integer.parseInt(sc.nextLine());
		}
		
		for (int i = 0; i < vetorInteiro.length; i++) {
			soma += vetorInteiro[i];
		}
		
		System.out.println("A soma dos valores do array é: "+ soma);
	}
}
