package Metodos;

public class ContaCorrente {
	int numeroConta;
	int agencia;
	String nomeTitular;
	double limiteSaque;
	double saldo;
	boolean statusVIP;
	
	void realizarSaque(double valorSaque) {
		if ((valorSaque <= saldo) && (valorSaque<= limiteSaque)) {
			saldo =+ saldo-valorSaque;
			System.out.println("Saque efetuado com sucesso!");
		}else {
			if (valorSaque> limiteSaque) {
				System.out.println("O saque não poderá ser feito, pois o seu limite de saque é: R$ "+limiteSaque);
			}else {
				 System.out.println("O valor disponível para saque é: R$ "+saldo);
			}
		}		
	}
	
	void deposito(double valorDeposito) {
		saldo += saldo+valorDeposito;
		System.out.println("R$ "+valorDeposito+" depositados com sucesso!");
	}
	
	void consultaSaldo() {
		System.out.println("O seu saldo é de: R$ "+saldo);
	}
	
	void aumentarLimite(double valorAumento) {
		limiteSaque = valorAumento;
		System.out.println("Limite de saque alterado com sucesso!");
	}
	
	

}
