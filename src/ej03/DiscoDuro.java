package ej03;

public class DiscoDuro extends Componente {

	private double capacidad;
	private String tipoBus;

	public DiscoDuro(String ref, String marca, float precio, double capacidad, String bus) {
		super(ref, marca, precio);
		this.capacidad = capacidad;
		this.tipoBus = bus;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public String getBus() {
		return tipoBus;
	}

	public void setBus(String bus) {
		this.tipoBus = bus;
	}

	
}
