package OrientacaoObjeto;

public class Carro {
	private String marca;
	private String modelo;
	private int numPassageiros;
	private double capCombustivel;
	private double consumoCombustivel;
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getnumPassageiros() {
		return numPassageiros;
	}
	
	public void setnumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}
	
	public void setMarca(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}
	
	public double getcapCombustivel() {
		return capCombustivel;
	}
	
	public void setcapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}
	
	public double getconsumoCombustivel() {
		return consumoCombustivel;
	}
	
	public void setconsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}
}
