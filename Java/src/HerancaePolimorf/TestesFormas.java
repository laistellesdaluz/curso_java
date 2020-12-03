package HerancaePolimorf;

import java.util.Scanner;

public class TestesFormas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		Quadrado quadrado = new Quadrado();
		Retangulo retangulo = new Retangulo();
		Triangulo triangulo = new Triangulo();
		Circulo circulo = new Circulo();
		
		
		do {
			System.out.println("CALCULO DAS FIGURAS GEOMETRICAS");
			System.out.println("--------------------------------");
			System.out.println("1 - QUADRADO | 2 - RETANGULO | 3 - TRIANGULO | 4 - CIRCULO | 5 - SAIR");
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("Informe a base/lado do quadrado:");
				quadrado.setLados(sc.nextDouble());
				System.out.println("Informe a altura do quadrado:");
				quadrado.setAltura(sc.nextDouble());
				quadrado.obterAreaQuadrado();
				System.out.println();
				break;
				
			case 2:
				System.out.println("Informe a base/lado do retângulo:");
				retangulo.setBase(sc.nextDouble());
				System.out.println("Informe a altura do retângulo:");
				retangulo.setAltura(sc.nextDouble());
				retangulo.obterAreaRetangulo();
				System.out.println();
				break;

			 case 3:
				 System.out.println("Informe a base/lado do triângulo:");
				 triangulo.setBase(sc.nextDouble());
				 System.out.println("Informe a altura do triângulo:");
				 triangulo.setAltura(sc.nextDouble());
				 triangulo.obterAreaTriangulo();
				 System.out.println();
				 break;
			 case 4:
				 System.out.println("Informe o raio do círculo:");
				 circulo.setRaio(sc.nextDouble());
				 circulo.obterAreaCirculo();
				 
			default:
				System.out.println("Opção inválida!");
				break;
			}
			
		} while ((opcao >= 1) && (opcao <5));
		
		
	}

}
