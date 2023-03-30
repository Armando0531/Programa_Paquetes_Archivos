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


	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

}
