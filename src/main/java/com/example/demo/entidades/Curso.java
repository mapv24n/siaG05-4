package com.example.demo.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Curso {
	
	@Id
	private int codCurso;
	private String nombre;
	private String grupo;
	
	public int getCodCurso() {
		return codCurso;
	}
	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

}
