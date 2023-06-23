package interfaces;

public class Diretor extends funcionario implements Autenticavel{

	private String senhaDiretor;
	
	public Diretor (String senha, String pNome, String uNome, String cpf) {
		super(pNome, uNome, cpf);
		senhaDiretor = senha;
	}
	
	public boolean autentica(String senha) {
		if(senha.length() > 6 && senha.charAt(2)== super.getPrimeiroNome().charAt(0) &&  senha.equals(senhaDiretor)) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return String.format("*********Diretor***********\n%s\n"
				+ "Autenticou? %b\n", super.toString(),
				this.autentica(this.getSenhaDiretor()));
	}

	public String getSenhaDiretor() {
		return senhaDiretor;
	}

	public void setSenhaDiretor(String senhaDiretor) {
		this.senhaDiretor = senhaDiretor;
	}
}
