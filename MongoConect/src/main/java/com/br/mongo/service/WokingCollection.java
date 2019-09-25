package com.br.mongo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class WokingCollection {

	@Autowired
	private MongoTemplate template;

	/*
	 * @param string string nome da collection
	 * 
	 * @return collection
	 */

	public void findCollection(String collectionName) {
		if (collectionName != null && collectionName.trim().length() > 0) {
			if (!template.collectionExists(collectionName)) {
				this.createCollection(collectionName);
			} else {
				throw new DataIntegrityViolationException("Essa Collection ja existe");
			}
		}
		else {
			throw new NullPointerException("Nome da collection em branco");
		}
	}

	/*
	 * @param string nome da collection
	 * 
	 * @return void
	 */
	private void createCollection(String collectionName) {
		template.createCollection(collectionName);
	}
}
