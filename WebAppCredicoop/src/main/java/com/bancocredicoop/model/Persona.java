package com.bancocredicoop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {

	@Id
	@Column
	private int idPersona;
	
	@Column (name="nombre")
	private String nombre;
	
	public int getIdPersona() {
		return idPersona;
	}
	

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
}
