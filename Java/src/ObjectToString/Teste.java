package ObjectToString;

public class Teste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ciência da Computação java");
		double[] notas = {10, 9, 8, 7};
		aluno.setNota(notas);
		
		System.out.println(aluno);
		
		String s1 = "laislinda";
		String s2 = "laislinda";
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		Aluno aluno2 = new Aluno();
		aluno2.setCurso("Ciência da Computação java");
		double[] notas2 = {10, 9, 8, 7};
		aluno2.setNota(notas2);
		
		System.out.println(aluno == aluno2);

	}

}
