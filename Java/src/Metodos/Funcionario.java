package Metodos;

public class Funcionario {
	String nome;
	String cpf;
	double horasTrabalhadas;
	double valorHoras;
	
	void calculaHora() {
		System.out.println(nome+" do CPF: "+cpf+" , vai receber: R$ "+(horasTrabalhadas*valorHoras));
	}
}
