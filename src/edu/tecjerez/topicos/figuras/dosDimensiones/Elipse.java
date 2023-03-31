package edu.tecjerez.topicos.figuras.dosDimensiones;

public class Elipse {
	
	private double radio1;
	private double radio2;

	public Elipse(double radio1, double radio2) {
		this.radio1 = radio1;
		this.radio2 = radio2;
	}

	public double obtenerArea() {
		return getRadio1()*getRadio2()*Math.PI;
	}
	public double obtenerPerimetro() {
		return 2*Math.PI*Math.sqrt((Math.pow(getRadio1(), 2)+(Math.pow(getRadio2(), 2)))/2);
	}

	protected double getRadio1() {
		return radio1;
	}
	protected void setRadio1(double radio1) {
		this.radio1 = radio1;
	}
	protected double getRadio2() {
		return radio2;
	}
	protected void setRadio2(double radio2) {
		this.radio2 = radio2;
	}
	
	

}
