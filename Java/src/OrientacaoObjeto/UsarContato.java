package OrientacaoObjeto;

public class UsarContato {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Lais");
		
		//relacionamento tem-um / has-one / HO = Endereço
		Endereco endereco = new Endereco();
		endereco.setNomeRua("Rua Nesio Antunes da Silva");
		endereco.setNumero("896");
		endereco.setComplemento("Final da rua");
		endereco.setCidade("Blumenau");
		endereco.setEstado("Santa Catarina");
		endereco.setCep("890.51-615");
		contato.setEndereco(endereco);
		
		//relacionamento tem-muitos = Telefones
		
		Telefone telefone1 = new Telefone();
		telefone1.setDdd("47");
		telefone1.setNumero("123456879");
		telefone1.setTipo("Celular");
		
		Telefone telefone2 = new Telefone();
		telefone2.setDdd("47");
		telefone2.setNumero("123456659");
		telefone2.setTipo("Casa");

		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone1;
		telefones[1] = telefone2;
		
		contato.setTelefone(telefones);
		
		//Teste Saída do console
		
		if (contato != null && contato.getEndereco() !=null) {
			for (Telefone telefone : contato.getTelefone()) {
				System.out.println(telefone.getNumero());
			}
			
		}
	}

}
