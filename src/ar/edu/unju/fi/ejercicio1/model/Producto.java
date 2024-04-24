package ar.edu.unju.fi.ejercicio1.model;

public class Producto {
	private String codigo;
	private String descripcion;
	private double precioUnitario;
	private OrigenFabricacion origenFab;
	private Categoria categoria;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public enum OrigenFabricacion{
		ARGENTINA,CHINA,BRASIL,URUGUAY
	}
	public enum Categoria{
		TELEFONIA,INFORMATICA,ELECTROHOGAR,HERRAMIENTAS
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public OrigenFabricacion getOrigenFab() {
		return origenFab;
	}
	public void setOrigenFab(OrigenFabricacion origenFab) {
		this.origenFab = origenFab;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Producto(String codigo, String descripcion, double precioUnitario, OrigenFabricacion origenFab,
			Categoria categoria) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.origenFab = origenFab;
		this.categoria = categoria;
	}
	
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precioUnitario=" + precioUnitario
				+ ", origenFab=" + origenFab + ", categoria=" + categoria + "]";
	}
	
	
	

}
