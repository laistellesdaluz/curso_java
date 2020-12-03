package HerancaePolimorf;

public class Quadrado extends FiguraGeometrica {
	private double lados;

	
	public double getLados() {
		return lados;
	}

	public void setLados(double lados) {
		this.lados = lados;
	}
	
	public void obterAreaQuadrado() {
		double area = lados*getAltura();
		System.out.println("A área do quadrado é: "+ area);
	}
	
}
