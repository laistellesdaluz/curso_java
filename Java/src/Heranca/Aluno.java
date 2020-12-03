package Heranca;

public class Aluno {
	private String curso;
	private double[] nota;
	
	
	
	public Aluno() {
		super();
	}
	
	public Aluno(String nome, String endereco, String telefone, String curso) {
		//super(nome, endereco, telefone);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNota() {
		return nota;
	}
	public void setNota(double[] nota) {
		this.nota = nota;
	}
	
	public double calcularMedia() {
		return 0;
	}
	public boolean verificarAprovado() {
		return true;
	}
	
	public String obterEtiquetaEndereco() {
		String s = "Endereço do aluno: ";
		//s += super.getEndereco();
		return s;
	}

	//@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println(this.obterEtiquetaEndereco());
		
	}

}
