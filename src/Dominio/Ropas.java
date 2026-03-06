package Dominio;

public class Ropas {
	
	private String marca;
	private char talla;
	private float precio;
	private int existencia;
	
	public Ropas(String marca, char talla, float precio, int existencia) {
		this.marca = marca;
		this.talla = talla;
		this.precio = precio;
		this.existencia = existencia;
	}
	
	@Override
	public String toString() {
		return "Ropas [marca=" + marca + ", talla=" + talla + ", precio=" + precio + ", existencia=" + existencia + "]\n";
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public char getTalla() {
		return talla;
	}
	public void setTalla(char talla) {
		this.talla = talla;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getExistencia() {
		return existencia;
	}
	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}
	
	
}
