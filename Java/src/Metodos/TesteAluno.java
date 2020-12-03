package Metodos;

import java.util.Scanner;

public class TesteAluno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		String lixo;
		
		System.out.println("Entre com o nome do aluno");
		lixo = sc.nextLine();
		aluno.nome = sc.nextLine();
		
		System.out.println("Entre com o nome do curso");
		lixo = sc.nextLine();
		aluno.nomeCurso = sc.nextLine();
		
		System.out.println("Entre com a matrícula");
		lixo = sc.nextLine();
		aluno.matricula = sc.nextLine();
		
		for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
			System.out.println("Entre com o nome da disciplina: "+i);
			aluno.nomeDisciplinas[i] = sc.nextLine();
		}
		
		for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
			System.out.println("Obtendo notas da disciplina: "+aluno.nomeDisciplinas[i]);
			for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
				System.out.println("Entre com a nota: "+(j+1));
				aluno.notasDisciplinas[i][j] = sc.nextDouble();
			}
		}
		aluno.mostrarInfo();
		
		for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
			if (aluno.verificarAprovado(i)) {
				System.out.println("Disciplina: "+ aluno.nomeDisciplinas[i]+ " - Foi aprovado");
			}else {
				System.out.println("Disciplina: "+ aluno.nomeDisciplinas[i]+" - Foi reprovado");
			}
		}
	}
}
