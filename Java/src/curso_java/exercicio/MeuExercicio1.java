package curso_java.exercicio;

import java.util.Scanner;

public class MeuExercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Maior nota dos alunos");
		
		System.out.println("Informe o nome do primeiro(a) aluno(a):");
		String primeiroNome = sc.nextLine();
		
		System.out.println("Informe a nota do(a) primeiro(a) aluno(a):");
		double primeiraNota = Double.parseDouble(sc.nextLine());
		
		System.out.println("Informe o nome do segundo(a) aluno(a):");
		String segundoNome = sc.nextLine();
		
		System.out.println("Informe a nota do(a) segundo(a) aluno(a):");
		double segundaNota = Double.parseDouble(sc.nextLine());
		
		System.out.println("Informe o nome do terceiro(a) aluno(a):");
		String terceiroNome = sc.nextLine();
		
		System.out.println("Informe a nota do(a) terceiro(a) aluno(a):");
		double terceiraNota = Double.parseDouble(sc.nextLine());

		if (primeiraNota > segundaNota && primeiraNota > terceiraNota) {
			System.out.println("O primeiro aluno tirou a maior nota que foi: " + primeiroNome + " que tirou nota: " + primeiraNota+"! PARABÉNS!");
		} else {
			if (segundaNota > primeiraNota && segundaNota > terceiraNota) {
				System.out.println("O segundo aluno tirou a maior nota que foi: " + segundoNome + " que tirou nota: " + segundaNota+"! PARABÉNS!");
			} else {
				if (terceiraNota > primeiraNota && terceiraNota > segundaNota) {
					System.out.println("O terceiro aluno tirou a maior nota que foi: " + terceiroNome + " que tirou nota: " + terceiraNota+"! PARABÉNS!");
				} else {
					System.out.println("Houve empate!");
				}
			}

		}
		sc.close();
	}
}
