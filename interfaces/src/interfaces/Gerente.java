package interfaces;

public class Gerente extends funcionario implements Autenticavel{

	private String senha;
	
	public Gerente(String senhaGerente, String pNome, String uNome, String cpf){
		super (pNome, uNome, cpf);
		senha = senhaGerente;
	}
	
	public boolean autentica(String senha) {
		return this.senha.equals(senha);
	}
	
	public String toString() {
		return String.format("********Dados gerente*********\n %s", super.toString());
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	

	
}
