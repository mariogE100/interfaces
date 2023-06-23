package interfaces;

public class FuncionarioTeste {
   public static void main(String args[]) {
	
	   Gerente gerente = new Gerente("123@mudar", "Paulo", "Afonso", "0224948-94");
	   Diretor diretor = new Diretor("123234", "Marla", "Paula", "8283772-33");
	   
	   System.out.println(gerente.toString());
	   System.out.println(diretor.toString());
	   diretor.setSenhaDiretor("23m4734");
	   
	   System.out.println("Diretor autenticou" + diretor.autentica(diretor.getSenhaDiretor));
}
}
