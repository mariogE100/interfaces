package interfaces;

public class Quadrado implements AreaCalculavel{

	private int lado;
	
	public Quadrado(int v) {
		lado = v;
	}
	
	public double calculaArea() {
		return lado * lado;
	}
}
