package curso_java;

import com.sun.javafx.css.CalculatedValue;

public class Main {
	
	public static void main(String[] args) {
		int calculado = calc(1,2);
		System.out.println(calculado);
	}
	
	public static int calc(int num1, int num2) {
		return num1 + num2;		
	}
}
