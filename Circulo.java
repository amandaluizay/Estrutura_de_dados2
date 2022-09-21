
public class Circulo implements Figura {
	private double raio;

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(raio, 2);
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 2*Math.PI*raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public String toString() {
		return "Circulo [raio=" + raio + "]";
	}

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}


}
