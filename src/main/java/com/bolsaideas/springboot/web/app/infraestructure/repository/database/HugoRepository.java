package com.bolsaideas.springboot.web.app.infraestructure.repository.database;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bolsaideas.springboot.web.app.infraestructure.dto.HugoDto;

public interface HugoRepository extends MongoRepository<HugoDto, String>{

}
