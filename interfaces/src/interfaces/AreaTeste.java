package interfaces;

public class AreaTeste {

	public static void main(String args[]) {
		Retangulo retangulo = new Retangulo(2, 4);
		Quadrado quadrado = new Quadrado(2);
		
		System.out.println("Area quadrado: "+ quadrado.calculaArea());
		System.out.println("Area retangulo: "+ retangulo.calculaArea());
	}
}
