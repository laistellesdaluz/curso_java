package ObjectToString;

import java.util.Arrays;

public class Aluno {
	
	private String curso;
	private double[] nota;
	
	
	
	public Aluno() {
		super();
	}



	public Aluno(String curso, double[] nota) {
		super();
		this.curso = curso;
		this.nota = nota;
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
	
	public String obterEtiquetaEndereco() {
		String s = "Endereço do aluno: ";
		//s += super.getEndereco();
		return s;
	}
	
	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", nota=" + Arrays.toString(nota) + "]";
	}



	//@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println(this.obterEtiquetaEndereco());
		
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curso == null) ? 0 : curso.hashCode());
		result = prime * result + Arrays.hashCode(nota);
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (!Arrays.equals(nota, other.nota))
			return false;
		return true;
	}
	
	/*public String toString() {
		return "Aluno [curso= "+curso+", notas= "+Arrays.toString(nota)+"[";
	}*/
	
//	public String toString() {
//		String s= curso + "\n";
//		for (double nota : nota) {
//			s+= nota+" ";
//		}
//		return s;
//	}
	

}
