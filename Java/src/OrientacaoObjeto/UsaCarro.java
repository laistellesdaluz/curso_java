package OrientacaoObjeto;

import java.util.Scanner;

public class UsaCarro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String lixo;
		Carro conversivel = new Carro();

	System.out.println("Digite a marca do convers�vel");
	conversivel.setMarca(sc.next());
	System.out.println("Digite o modelo do convers�vel");
	lixo = sc.nextLine();
	conversivel.setModelo(sc.nextLine());
	System.out.println("Digite o n�mero de passageiros do convers�vel");
	conversivel.setnumPassageiros(sc.nextInt());
	System.out.println("Digite a capacidade de combust�vel do convers�vel");
	conversivel.setcapCombustivel(sc.nextDouble());
	System.out.println("Digite o consumo de combust�vel do convers�vel");
	conversivel.setconsumoCombustivel(sc.nextDouble());
	
	System.out.println("CONVERS�VEL CADASTRADO:");
	System.out.println("-----------------------");
	System.out.print("Marca: ");
	System.out.println(conversivel.getMarca());
	System.out.print("Modelo: ");
	System.out.println(conversivel.getModelo());
	System.out.print("N�mero de passageiros: ");
	System.out.println(conversivel.getnumPassageiros());
	System.out.print("Capacidade de combust�vel: ");
	System.out.println(conversivel.getcapCombustivel());
	System.out.print("Consumo de combust�vel: ");
	System.out.println(conversivel.getconsumoCombustivel());
	}

}
