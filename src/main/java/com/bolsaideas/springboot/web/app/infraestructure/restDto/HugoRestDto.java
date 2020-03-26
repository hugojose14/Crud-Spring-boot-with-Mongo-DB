package com.bolsaideas.springboot.web.app.infraestructure.restDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HugoRestDto {
	
	private String id;
	private String nombre;
	private Integer cedula;
	private String correo;
	
}
