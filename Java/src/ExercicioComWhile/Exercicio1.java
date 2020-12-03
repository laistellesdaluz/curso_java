package ExercicioComWhile;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double paisA = 1;
		double paisB = 0;
		double perc1 = 0;
		double perc2 = 1;
		while ((paisA > paisB) || (perc1 < perc2)) {
			System.out.println("Informe a população do país A:");
			paisA = sc.nextDouble();
			System.out.println("Informe a taxa de percentual de crescimento do país A:");
			perc1 = sc.nextDouble();
			System.out.println("Informe a população do país B:");
			paisB = sc.nextDouble();
			System.out.println("Informe a taxa de percentual de crescimento do país B:");
			perc2 = sc.nextDouble();			
			
			if (paisA > paisB) {
				System.out.println("O país B deve ser mais populosos que o país A!");
			}
			if (perc1 < perc2) {
				System.out.println("O percentual do país A deve ser maior que o percentual do país B!");
			}
		}
	
		int anos = 0;
		
		do {
			paisA += (paisA/100)*perc1;
			paisB += (paisB/100)*perc2;
			anos++;					
		} while (paisA < paisB);
		
		System.out.println("País A: "+paisA);
		System.out.println("País B: "+paisB);
		System.out.println("A quantidade de anos que leva para que a população do país A ultrapasse ou iguale a população do país B é: "+anos);
	}
}
