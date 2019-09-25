package com.br.mongo.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.br.mongo.service.WokingCollection;

public class MongoObjectServiceTest extends AbstractIntegrationTest {

	@Autowired
	private WokingCollection collection;

	/*
	 * CREATE COLLECTION
	 */
	@Test

	public void createCollectionMustPass() {
		this.collection.findCollection("teste2");
	}

	/*
	 * MUST FAIL
	 */
		
	/*
	 * CREATING COLLECTION WITH THE EXISTING NAME
	 */
	@Test
	public void createCollectionExistingNameMustFail() {
		this.collection.findCollection("teste");
	}

	/* CREATING COLLECTION WITH THE BLANK NAME */
	
	@Test
	public void createCollectionNameNulllMustFail() {
		this.collection.findCollection(" ");
	}

}
