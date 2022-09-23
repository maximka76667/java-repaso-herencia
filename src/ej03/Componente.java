package ej03;

public class Componente {

	private String ref, marca;
	private float precio;

	public Componente(String ref, String marca, float precio) {
		this.ref = ref;
		this.marca = marca;
		this.precio = precio;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public float getPrecioConDescuento(double descuento) {
		return (float) (precio * (1 - descuento));
	}

}
