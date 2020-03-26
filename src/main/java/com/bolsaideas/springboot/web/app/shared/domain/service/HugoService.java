package com.bolsaideas.springboot.web.app.shared.domain.service;

import java.util.List;

import com.bolsaideas.springboot.web.app.shared.domain.IdHugo;
import com.bolsaideas.springboot.web.app.shared.domain.model.Hugo;

public interface HugoService {

	public List<Hugo> findAll();
	
	public Hugo findById(IdHugo id);
	
	public Hugo save(Hugo hugo);
	
	public void delete(IdHugo id);
	
	public Hugo update(Hugo hugo);
	
}
