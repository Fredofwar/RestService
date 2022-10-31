package com.example.curso.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="curso")
public class Curso implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long curso_id;	
	
	private String nombre;
	
	@Column(name = "profesor_id")
	private Long profesorId; //Se renombro la propiedad sin _ ya que causa probelmas con la interfaz crudrepository 
	//https://stackoverflow.com/questions/61255715/spring-data-failed-to-create-query-for-method#comment108367830_61255715
	public Curso() {
		
	}

	public Long getCurso_id() {
		return curso_id;
	}

	public void setCurso_id(Long curso_id) {
		this.curso_id = curso_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getProfesor_id() {
		return profesorId;
	}

	public void setProfesor_id(Long profesor_id) {
		this.profesorId = profesor_id;
	}
	
}
