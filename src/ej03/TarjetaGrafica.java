package ej03;

public class TarjetaGrafica extends Componente {

	private String modelo, tipoBus;
	private double memoria;

	public TarjetaGrafica(String ref, String marca, float precio, String modelo, String tipoBus, double memoria) {
		super(ref, marca, precio);
		this.modelo = modelo;
		this.tipoBus = tipoBus;
		this.memoria = memoria;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipoBus() {
		return tipoBus;
	}

	public void setTipoBus(String tipoBus) {
		this.tipoBus = tipoBus;
	}

	public double getMemoria() {
		return memoria;
	}

	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}

}
