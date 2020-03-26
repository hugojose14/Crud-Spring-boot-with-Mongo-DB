package com.bolsaideas.springboot.web.app.infraestructure.controllers;

import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolsaideas.springboot.web.app.application.HugoApplication;
import com.bolsaideas.springboot.web.app.infraestructure.mapper.HugoMapper;
import com.bolsaideas.springboot.web.app.infraestructure.restDto.HugoRestDto;
import com.bolsaideas.springboot.web.app.shared.domain.IdHugo;
import com.bolsaideas.springboot.web.app.shared.domain.model.Hugo;
import com.bolsaideas.springboot.web.app.shared.domain.service.HugoService;

@RestController
@RequestMapping("/api/hugo")
public class HugoController {
	
	private HugoApplication hugoApp;
	
	@Autowired
	private HugoService hugoService;
	
	public HugoController(@Autowired HugoService hugoService) {
		this.hugoApp = new HugoApplication(hugoService);
	}
	
	@PostMapping
	HugoRestDto saveHugo(@RequestBody HugoRestDto hugo) {
		return HugoMapper.INSTANCE.apiConvertirDominioParaDto(hugoApp.saveHugo(HugoMapper.INSTANCE.apiConvertirDtoParaDominio(hugo)));
		
	}
	
	@GetMapping
	public List<HugoRestDto> getHugos(){
		return HugoMapper.INSTANCE.apitransformarListDominioParaDto(hugoApp.findAllHugo());
	}
	
	@GetMapping("/{id}")
	public HugoRestDto getHugo(@PathVariable String id) {
		return HugoMapper.INSTANCE.apiConvertirDominioParaDto(hugoApp.getHugo(new IdHugo(id)));
	}
	
	@DeleteMapping("/{id}")
	public void deleteHugo(@PathVariable String id) {
		hugoApp.deleteHugo(new IdHugo(id));	
	}
	
	@PutMapping
	public HugoRestDto updateHugo(@RequestBody HugoRestDto hugo) {
		return HugoMapper.INSTANCE.apiConvertirDominioParaDto(hugoApp.updateHugo(HugoMapper.INSTANCE.apiConvertirDtoParaDominio(hugo)));
	}
	
	
	
}
