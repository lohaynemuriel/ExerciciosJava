package modelo;

public class Quadrado implements FiguraGeometrica {

	double lado;

	
	public Quadrado(double lado) {
		this.lado=lado;
	}
	
	
	public double getArea() {
		return this.lado*this.lado;
	}

	
	public double getPerimetro() {
		return lado*4;
	}
	
	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}

}
