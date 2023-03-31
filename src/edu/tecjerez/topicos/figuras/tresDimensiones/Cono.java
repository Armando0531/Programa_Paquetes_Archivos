package edu.tecjerez.topicos.figuras.tresDimensiones;

public class Cono {

	private double radio;
	private double altura;

	public Cono(double radio, double altura) {
		this.radio = radio;
		this.altura = altura;
	}

	public double obtenerVolumen() {
		return (Math.PI*Math.pow(getRadio(), 2)*getAltura())/3;
	}
	public double obtenerArea() {
		double generatriz= Math.sqrt(Math.pow(getRadio(), 2)+Math.pow(getAltura(), 2));
		return Math.PI*getRadio()*(getRadio()+generatriz);
	}


	protected double getRadio() {
		return radio;
	}
	protected void setRadio(double radio) {
		this.radio = radio;
	}
	protected double getAltura() {
		return altura;
	}
	protected void setAltura(double altura) {
		this.altura = altura;
	}

}
