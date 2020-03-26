package com.bolsaideas.springboot.web.app.shared.domain.model;

import com.bolsaideas.springboot.web.app.shared.domain.Cedula;
import com.bolsaideas.springboot.web.app.shared.domain.Email;
import com.bolsaideas.springboot.web.app.shared.domain.IdHugo;
import com.bolsaideas.springboot.web.app.shared.domain.Nombre;

public class Hugo {
	
	private final IdHugo id;
	private final Nombre nombre;
	private final Cedula cedula;
	private final Email email;
	
	public static Hugo of(IdHugo id, Nombre nombre, Cedula cedula, Email email) {
		return new Hugo(id,nombre,cedula,email);
	}

	private Hugo(IdHugo id, Nombre nombre, Cedula cedula, Email email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cedula = cedula;
		this.email = email;
	}

	public IdHugo getId() {
		return id;
	}

	public Nombre getNombre() {
		return nombre;
	}

	public Cedula getCedula() {
		return cedula;
	}

	public Email getEmail() {
		return email;
	}
	
	
	
}
