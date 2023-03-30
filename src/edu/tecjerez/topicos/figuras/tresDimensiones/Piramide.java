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

	public double getRaizBase() {
		return raizBase;
	}
	public void setRaizBase(double raizBase) {
		this.raizBase = raizBase;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

}
