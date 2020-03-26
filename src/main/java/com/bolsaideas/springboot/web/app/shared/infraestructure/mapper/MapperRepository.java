package com.bolsaideas.springboot.web.app.shared.infraestructure.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public interface MapperRepository <Dto,Dominio>{
	
	public Dto convertirDominioParaDto(Dominio o);

	public Dominio convetirDtoParaDominio(Dto i);

	public default List<Dominio> convertirListaDtoParaDominio(List<Dto> i) 
	{
		Optional<List<Dto>> lista = Optional.ofNullable(i);
		if(!lista.isPresent()) return new ArrayList<Dominio>();
		return i.stream().map(var -> convetirDtoParaDominio(var)).collect(Collectors.toList());
	}

	public default List<Dto> convertirListaDominioParaDto(List<Dominio> o) {
		return o.stream().map(var -> convertirDominioParaDto(var)).collect(Collectors.toList());
	}
	

}
