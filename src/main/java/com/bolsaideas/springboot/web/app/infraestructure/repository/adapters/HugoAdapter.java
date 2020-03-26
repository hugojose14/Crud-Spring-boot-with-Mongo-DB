package com.bolsaideas.springboot.web.app.infraestructure.repository.adapters;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsaideas.springboot.web.app.infraestructure.mapper.HugoMapper;
import com.bolsaideas.springboot.web.app.infraestructure.repository.database.HugoRepository;
import com.bolsaideas.springboot.web.app.shared.domain.IdHugo;
import com.bolsaideas.springboot.web.app.shared.domain.model.Hugo;
import com.bolsaideas.springboot.web.app.shared.domain.service.HugoService;

@Service
public class HugoAdapter implements HugoService{
	
	@Autowired
	private HugoRepository hugoRepository;
	
	
	@Override
	public List<Hugo> findAll() {
		
		return HugoMapper.INSTANCE.convertirListaDtoParaDominio(hugoRepository.findAll());
		
	}

	@Override
	public Hugo findById(IdHugo id) {
		return HugoMapper.INSTANCE.convetirDtoParaDominio((hugoRepository.findById(id.getId()).orElseThrow(() -> new RuntimeException("No se encuentra el registro"))));
	}

	@Override
	public Hugo save(Hugo hugo) {
		
		return HugoMapper.INSTANCE.convetirDtoParaDominio(hugoRepository.save(HugoMapper.INSTANCE.convertirDominioParaDto(hugo)));
		
	}

	@Override
	public void delete(IdHugo idHugo) {
//		HugoDto hugo = HugoMapper.INSTANCE.convertirDominioParaDto(this.findById(id));
		hugoRepository.deleteById(idHugo.getId());
		
		
	}

	@Override
	public Hugo update(Hugo hugo) {
		this.findById(hugo.getId());
		return HugoMapper.INSTANCE.convetirDtoParaDominio(hugoRepository.save(HugoMapper.INSTANCE.convertirDominioParaDto(hugo)));
	}
	
	

}
