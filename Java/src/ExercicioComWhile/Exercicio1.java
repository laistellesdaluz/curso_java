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
			System.out.println("Informe a popula��o do pa�s A:");
			paisA = sc.nextDouble();
			System.out.println("Informe a taxa de percentual de crescimento do pa�s A:");
			perc1 = sc.nextDouble();
			System.out.println("Informe a popula��o do pa�s B:");
			paisB = sc.nextDouble();
			System.out.println("Informe a taxa de percentual de crescimento do pa�s B:");
			perc2 = sc.nextDouble();			
			
			if (paisA > paisB) {
				System.out.println("O pa�s B deve ser mais populosos que o pa�s A!");
			}
			if (perc1 < perc2) {
				System.out.println("O percentual do pa�s A deve ser maior que o percentual do pa�s B!");
			}
		}
	
		int anos = 0;
		
		do {
			paisA += (paisA/100)*perc1;
			paisB += (paisB/100)*perc2;
			anos++;					
		} while (paisA < paisB);
		
		System.out.println("Pa�s A: "+paisA);
		System.out.println("Pa�s B: "+paisB);
		System.out.println("A quantidade de anos que leva para que a popula��o do pa�s A ultrapasse ou iguale a popula��o do pa�s B �: "+anos);
	}
}
