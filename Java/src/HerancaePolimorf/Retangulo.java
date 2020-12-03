package HerancaePolimorf;

public class Retangulo extends FiguraGeometrica {
	public double base;

	public Retangulo() {
		super();
	}
	
	public Retangulo(double base) {
		super();
		this.base = base;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	public void obterAreaRetangulo() {
		double area = base*getAltura();
		System.out.println("A área do retângulo é: "+ area);
	}
	

}
