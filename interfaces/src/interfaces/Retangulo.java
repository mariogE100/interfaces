package interfaces;

public class Retangulo implements AreaCalculavel{

	private double altura;
	private double base;
	
	public Retangulo(double c, double d) {
		base = c;
		altura = d;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
}
