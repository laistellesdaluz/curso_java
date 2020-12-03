package curso_java.UtilizandoVetores;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos alunos tem na sala?");
		int numeroAlunos = Integer.parseInt(sc.nextLine());
		
		String[] nomeAlunos = new String[numeroAlunos];
		
		for (int i = 0; i < numeroAlunos; i++) {
			System.out.println("Informe o nome do "+(i+1)+"º aluno:");
			nomeAlunos[i] = sc.nextLine();
		}
		
		Arrays.sort(nomeAlunos);
		System.out.println("");
		System.out.println("Impressão em ordem alfabética com FOR NORMAL");
		for (int i = 0; i < numeroAlunos; i++) {
			System.out.println(nomeAlunos[i]);
		}
		
		int contador = 0;
		for (String coluna : nomeAlunos) {
			System.out.println("Informe o nome do "+(contador+1)+"º aluno:");
			nomeAlunos[contador] = sc.nextLine();
			contador++;
		}
		
		Arrays.parallelSort(nomeAlunos);
		contador = 0;
		System.out.println("");
		System.out.println("Impressão em ordem alfabética com FOREACH");
		for (String coluna : nomeAlunos) {
			System.out.println(nomeAlunos[contador]);
			contador++;
		}
	}
}
