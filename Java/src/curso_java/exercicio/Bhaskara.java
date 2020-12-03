package curso_java.exercicio;

public class Bhaskara {
	public static void main(String[] args) {
		int a = 3;
		int b = -2;
		int c = -8;
		double delta;
				
		delta = (b*b)-(4*a*c);
		System.out.println(delta);
		
		//double x = ((-(b)+ Math.sqrt(delta))/2*a);
		
		double x1 = ((-1*(b)- (Math.sqrt(delta)))/(2*a));		
		double x2 = ((-1*(b)+ (Math.sqrt(delta)))/(2*a));
		
		System.out.println("delta "+(Math.sqrt(delta)));
		
		System.out.println(x1);
		System.out.println(x2);
	}

}
