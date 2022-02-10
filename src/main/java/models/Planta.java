package models;

public class Planta {

	private String nombre;
	private String codigo;
	private String descripcion;
	
	public Planta() {
		
	}

	public Planta(String nombre, String codigo, String descripcion) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public String colorDeFlor(String color) {
		
		return "";
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	
	
	
	
}

