package com.br.mongo.entity;

import org.bson.Document;
import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class EntityMaster {
	@Id
	private String id;
	
	private Document document;
	


}
