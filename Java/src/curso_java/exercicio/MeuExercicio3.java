package curso_java.exercicio;

import java.util.Scanner;

public class MeuExercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("CALCULO IMC");
		System.out.println("Informe o seu peso:");
		double peso = sc.nextDouble();
		System.out.println("Informe s sua altura:");
		double altura = sc.nextDouble();		
		double imc = (peso/(altura*altura));
		
		if (imc < 22) {
			System.out.println("Voc� est� abaixo do peso ideal! Pode comer que ta tranquilo.");			
		}else if (imc >= 22 && imc <= 27) {
			System.out.println("Voc� est� com peso ideal! Continue assim!");
		}else if (imc > 27 && imc <= 30) {
			System.out.println("Voc� est� com sobrepeso! D� uma maneirada no carbo!");
		}else if (imc > 30 && imc <= 35) {
			System.out.println("Voc� est� com obesidade grau I! D� uma segurada a�.");
		}else if (imc > 35 && imc <= 39.9) {
			System.out.println("Voc� est� com obesidade grau II! T� feia a coisa!");
		}else {
			System.out.println("Voc� est� muito gordo! Ou para de comer ou tu vai explodir!");
		}
		}				
}

