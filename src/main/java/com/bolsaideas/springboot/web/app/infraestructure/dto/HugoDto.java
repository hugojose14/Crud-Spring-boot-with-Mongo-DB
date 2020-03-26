package com.bolsaideas.springboot.web.app.infraestructure.dto;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "hugos")
public class HugoDto {
	
	@Id
	private String id = new ObjectId().toString();
	private String nombre;
	private Integer cedula;
	private String correo;
	
	public HugoDto() {
	}
	
	public HugoDto(String id, String nombre, Integer cedula, String correo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cedula = cedula;
		this.correo = correo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCedula() {
		return cedula;
	}

	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
}

