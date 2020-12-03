package HerancaePolimorf;

public class Circulo {
	private double raio;
	private double circunferencia;
	
	public Circulo() {
		super();
	}
	
	public Circulo(double raio, double circunferencia) {
		super();
		this.raio = raio;
		this.circunferencia = circunferencia;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getCircunferencia() {
		return circunferencia;
	}

	public void setCircunferencia(double circunferencia) {
		this.circunferencia = circunferencia;
	}
	
	public void obterAreaCirculo() {
		double area = ((raio*raio)*3.14);
		System.out.println("A área do círculo é: "+ area);
	}
	
}
