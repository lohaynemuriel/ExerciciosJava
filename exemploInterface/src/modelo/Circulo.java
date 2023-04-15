package modelo;

public class Circulo implements FiguraGeometrica {
	double raio;
	
	
	public Circulo(double raio) {
		this.raio=raio;
	}
	
	public double getArea() {
		return Math.PI*Math.pow(raio, 2);
	}

	
	public double getPerimetro() {
		return 2*Math.PI*raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

}
