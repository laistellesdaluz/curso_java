package Metodos;

import java.util.Scanner;

public class TesteFuncionario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		String lixo;
		
		System.out.println("Entre com o nome do funcionário");
		lixo = sc.nextLine();
		funcionario.nome = sc.nextLine();
		
		System.out.println("Entre com o CPF do funcionário");
		funcionario.cpf = sc.nextLine();
		
		System.out.println("Entre com a quantidade de horas trabalhadas");
		funcionario.horasTrabalhadas = sc.nextDouble();
		
		System.out.println("Entre com o valor da hora");
		funcionario.valorHoras = sc.nextDouble();
		
		funcionario.calculaHora();
	}
	

}
