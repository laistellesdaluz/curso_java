package HerancaePolimorf;

public class Triangulo extends FiguraGeometrica {
	private double base;
	
	public Triangulo() {
		super();
	}
	
	public Triangulo(double altura, double area, double base) {
		super(altura, area);
		this.base = base;
	}


	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	public void obterAreaTriangulo() {
		double area = (base*getAltura()/2);
		System.out.println("A área do triângulo é: "+ area);
	}
	
	
}
