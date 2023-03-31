package edu.tecjerez.topicos.figuras.tresDimensiones;

public class Piramide {

	private double raizBase;
	private double altura;

	public Piramide(double raizBase, double altura) {
		this.raizBase = raizBase;
		this.altura = altura;
	}

	public double obtenerVolumen() {
		return Math.pow(getRaizBase(), 2)*getAltura()/3;
	}
	public double obtenerArea() {
		double ap = Math.sqrt(Math.pow((getRaizBase()/2), 2)+Math.pow(getAltura(), 2));
		return getRaizBase()*(2*ap+getRaizBase());
	}

	protected double getRaizBase() {
		return raizBase;
	}
	protected void setRaizBase(double raizBase) {
		this.raizBase = raizBase;
	}
	protected double getAltura() {
		return altura;
	}
	protected void setAltura(double altura) {
		this.altura = altura;
	}

}
