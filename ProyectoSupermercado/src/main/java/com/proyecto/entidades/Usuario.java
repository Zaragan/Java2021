package com.proyecto.entidades;

public class Usuario {
	//	DECLARAR VARIABLES
	private Integer id, rol;
	private String email, password, nombre;
	//	CONSTRUCTOR
	public Usuario(String email, String password, String nombre, Integer rol) {
		setEmail(email);
		setPassword(password);
		setNombre(nombre);
		setRol(rol);
	}
	//	GETTERS Y SETTERS
	public Integer getRol() {
		return rol;
	}	//	setEmail
	public void setRol(Integer rol) {
		this.rol = rol;
	}	//	getID
	public Integer getId() {
		return id;
	}	//	getEmail
	public String getEmail() {
		return email;
	}	//	setEmail
	public void setEmail(String email) {
		this.email = email;
	}	//	 getPassword
	public String getPassword() {
		return password;
	}	//	setPassword
	public void setPassword(String password) {
		this.password = password;
	}	//	getNombre
	public String getNombre() {
		return nombre;
	}	//	setNombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//		TO STRING
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", email=" + email + ", password=" + password + ", nombre=" + nombre + "]";
	}
	//	HASHCODE Y EQUALS
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
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
		Usuario other = (Usuario) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
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
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
}
