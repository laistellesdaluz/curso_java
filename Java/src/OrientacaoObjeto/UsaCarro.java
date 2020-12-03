package OrientacaoObjeto;

import java.util.Scanner;

public class UsaCarro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String lixo;
		Carro conversivel = new Carro();

	System.out.println("Digite a marca do conversível");
	conversivel.setMarca(sc.next());
	System.out.println("Digite o modelo do conversível");
	lixo = sc.nextLine();
	conversivel.setModelo(sc.nextLine());
	System.out.println("Digite o número de passageiros do conversível");
	conversivel.setnumPassageiros(sc.nextInt());
	System.out.println("Digite a capacidade de combustível do conversível");
	conversivel.setcapCombustivel(sc.nextDouble());
	System.out.println("Digite o consumo de combustível do conversível");
	conversivel.setconsumoCombustivel(sc.nextDouble());
	
	System.out.println("CONVERSÍVEL CADASTRADO:");
	System.out.println("-----------------------");
	System.out.print("Marca: ");
	System.out.println(conversivel.getMarca());
	System.out.print("Modelo: ");
	System.out.println(conversivel.getModelo());
	System.out.print("Número de passageiros: ");
	System.out.println(conversivel.getnumPassageiros());
	System.out.print("Capacidade de combustível: ");
	System.out.println(conversivel.getcapCombustivel());
	System.out.print("Consumo de combustível: ");
	System.out.println(conversivel.getconsumoCombustivel());
	}

}
