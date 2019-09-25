package com.br.mongo.service;

import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.br.mongo.entity.EntityMaster;
import com.br.mongo.repository.MongoObject;

@Service
@Transactional
public class MongoObjectService {
	
	@Autowired
	private MongoObject repository;
	@Autowired
	private MongoTemplate template;
	/*
	 * @param Document(BSON)
	 * 
	 * @return the save entity
	 */
	public EntityMaster MongoObjectSave(String document) {
		EntityMaster saveEntity = null;
		EntityMaster entity = new EntityMaster();
		entity.setDocument(this.parStringToDocument(document));
		saveEntity = this.template.save(entity,"teste");
		return saveEntity;
	}
	
	/*
	 * @return all document
	 */
		public List<EntityMaster> findAll() {
		List<EntityMaster> findAll =null;
		findAll = this.repository.findAll();
		return findAll;
	}

	/*
	 * @param String
	 * 
	 * @return document
	 */
		public Document parStringToDocument(String document) {
			Document newDocument = new Document();
			return newDocument.parse(document);
		}
}
