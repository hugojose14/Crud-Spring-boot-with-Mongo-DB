package com.bolsaideas.springboot.web.app.application;

import java.util.List;

import com.bolsaideas.springboot.web.app.shared.domain.IdHugo;
import com.bolsaideas.springboot.web.app.shared.domain.model.Hugo;
import com.bolsaideas.springboot.web.app.shared.domain.service.HugoService;

public class HugoApplication {
	
	private HugoService service;
	
	public HugoApplication (HugoService hugoService) {
		this.service = hugoService;
	}
	
	public Hugo saveHugo(Hugo hugo) {
		return service.save(hugo);
	}
	
	public List<Hugo> findAllHugo(){
		return service.findAll();
	}
	
	public Hugo getHugo(IdHugo idHugo) {
		return service.findById(idHugo);
	}
	
	public void deleteHugo (IdHugo id) {
		 service.delete(id);
	}
	
	public Hugo updateHugo(Hugo hugo) {
		return service.update(hugo);
	}
	
}
