package edu.tecjerez.topicos.figuras.dosDimensiones;

public class Circulo {
	
	private double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}
	public double obtenerArea() {
		return Math.PI*Math.pow(getRadio(), 2);
	}
	public double obtenerPerimetro() {
		return 2*Math.PI*getRadio();
	}

	protected double getRadio() {
		return radio;
	}
	protected void setRadio(double radio) {
		this.radio = radio;
	}

}
