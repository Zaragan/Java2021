package com.proyecto.entidades;

public class Producto {
	//	DECLARAR VARIABLES
	private Integer id, precio;
	private String nombre;
	//	CONSTRUCTOR
	public Producto(Integer id, Integer precio, String nombre) {
		setPrecio(precio);
		setNombre(nombre);
	}	//	getId
	public Integer getId() {
		return id;
	}	//	getPrecio
	public Integer getPrecio() {
		return precio;
	}	//	setPrecio
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}	//	getNombre
	public String getNombre() {
		return nombre;
	}	//	setNombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//	HASHCODE y EQUALS
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((precio == null) ? 0 : precio.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (precio == null) {
			if (other.precio != null)
				return false;
		} else if (!precio.equals(other.precio))
			return false;
		return true;
	}
}
