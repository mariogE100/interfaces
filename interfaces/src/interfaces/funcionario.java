package interfaces;

public class funcionario {

	private String primeiroNome;
	private String ultimoNome;
	private String cpf;
	
	public funcionario(String a, String b, String c){
		primeiroNome = a;
		ultimoNome = b;
		cpf = c;
	}//fim construtor

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString() {
		return String.format("Nome: %s %s \n CPF: %s", this.getPrimeiroNome(),
				this.getUltimoNome(), this.getCpf());
	}//fim toString
}//fim classe
