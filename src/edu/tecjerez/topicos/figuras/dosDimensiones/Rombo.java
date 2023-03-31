package edu.tecjerez.topicos.figuras.dosDimensiones;

public class Rombo {

	private double base;
	private double altura;

	public Rombo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double obtenerArea() {
		return getBase()*getAltura()/2;
	}
	public double obtenerPerimetro() {
		return Math.sqrt(Math.pow(getBase()/2, 2)+Math.pow(getAltura()/2, 2))*4;
	}

	protected double getBase() {
		return base;
	}
	protected void setBase(double base) {
		this.base = base;
	}
	protected double getAltura() {
		return altura;
	}
	protected void setAltura(double altura) {
		this.altura = altura;
	}

}
