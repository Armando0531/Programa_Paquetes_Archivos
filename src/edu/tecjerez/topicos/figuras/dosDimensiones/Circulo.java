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

	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}

}
