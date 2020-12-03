package Heranca;

public class Professor {
	private String nomeCurso;
	private double salario;
	
	public Professor() {
		super();
	}
	
	public Professor(String nome, String endereco, String telefone, String nomeCurso, double salario) {
		//super(nome, endereco, telefone);
		this.nomeCurso = nomeCurso;
		this.salario = salario;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calcularSalarioLiquido() {
		return 0;
	}	
	
	public String obterEtiquetaEndereco() {
		String s = "Endereço do Professor: ";
		//s += super.getEndereco();
		return s;
	}

	//@Override
//	public void imprimirEtiquetaEndereco() {
//		System.out.println("Imprimindo endereço do professor");
//		System.out.println(this.obterEtiquetaEndereco());
//		
//	}
}
