package com.bolsaideas.springboot.web.app.infraestructure.mapper;

import org.springframework.stereotype.Component;

import com.bolsaideas.springboot.web.app.infraestructure.dto.HugoDto;
import com.bolsaideas.springboot.web.app.infraestructure.restDto.HugoRestDto;
import com.bolsaideas.springboot.web.app.shared.domain.Cedula;
import com.bolsaideas.springboot.web.app.shared.domain.Email;
import com.bolsaideas.springboot.web.app.shared.domain.IdHugo;
import com.bolsaideas.springboot.web.app.shared.domain.Nombre;
import com.bolsaideas.springboot.web.app.shared.domain.model.Hugo;
import com.bolsaideas.springboot.web.app.shared.infraestructure.mapper.MapperApiRest;
import com.bolsaideas.springboot.web.app.shared.infraestructure.mapper.MapperRepository;

@Component
public class HugoMapper implements MapperRepository<HugoDto,Hugo>,MapperApiRest<HugoRestDto,Hugo> {
	
	public static final  HugoMapper INSTANCE = new HugoMapper();
	
	
	@Override
	public HugoRestDto apiConvertirDominioParaDto(Hugo o) {
		
		return new HugoRestDto(o.getId().getId(),o.getNombre().getNombre(),o.getCedula().getCedula(),o.getEmail().getEmail());
	}

	@Override
	public Hugo apiConvertirDtoParaDominio(HugoRestDto i) {
		return Hugo.of(new IdHugo(i.getId()), new Nombre(i.getNombre()),new Cedula(i.getCedula()), new Email(i.getCorreo()));
	}

	@Override
	public HugoDto convertirDominioParaDto(Hugo o) {
		
		HugoDto hugoDto = new HugoDto();
		
		hugoDto.setId(o.getId().getId());
		hugoDto.setNombre(o.getNombre().getNombre());
		hugoDto.setCedula(o.getCedula().getCedula());
		hugoDto.setCorreo(o.getEmail().getEmail());
		
		return hugoDto;
		
	}

	@Override
	public Hugo convetirDtoParaDominio(HugoDto i) {
		return Hugo.of(new IdHugo(i.getId()), new Nombre(i.getNombre()), new Cedula(i.getCedula()), new Email(i.getCorreo()));
	}

	
	
	
}
