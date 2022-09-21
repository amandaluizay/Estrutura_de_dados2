
public class Retangulo implements Figura {
	private double base, altura;

	@Override
	public double getArea() {
		return base*altura;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 2*base+2*altura;
	}

	public double getBase() {
		return base;
	}

	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Retangulo [base=" + base + ", altura=" + altura + "]";
	}

}
