package com.bolsaideas.springboot.web.app.shared.infraestructure.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public interface MapperApiRest <RestDto,Dominio>{
	
	public RestDto apiConvertirDominioParaDto(Dominio o);

	public Dominio apiConvertirDtoParaDominio(RestDto i);
	
	public default List<Dominio> apitransformarListaDtoParaDominio(List<RestDto> instancias) 
	{
		Optional<List<RestDto>> lista = Optional.ofNullable(instancias);
		if(!lista.isPresent()) return new ArrayList<Dominio>();
	
		return instancias.stream().map(i -> apiConvertirDtoParaDominio(i)).collect(Collectors.toList());
	}

	public default List<RestDto> apitransformarListDominioParaDto(List<Dominio> instancias) 
	{	
		Optional<List<Dominio>> lista = Optional.ofNullable(instancias);
		if(!lista.isPresent()) return new ArrayList<RestDto>();
		return instancias.stream().map(o -> apiConvertirDominioParaDto(o)).collect(Collectors.toList());
	}
	
}