package Pack1Exercicios;

import java.util.Scanner;

import javafx.scene.transform.Scale;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------------");
		System.out.println("   CALCULADORA DE POTENCIA");
		System.out.println("------------------------------");
		System.out.println("Informe o primeiro número:");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("Informe o segundo número:");
		int y = Integer.parseInt(sc.nextLine());
		int resultado = 0;
		
		for (int i = 0; i < y; i++) {
			resultado = (resultado+(x*x));			
		}
		System.out.println("O resultado de "+x+" elevado a "+y+" é: "+resultado);
	}
}
