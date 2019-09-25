package com.br.mongo.controller;

import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.mongo.entity.EntityMaster;
import com.br.mongo.service.MongoObjectService;

@RestController
@RequestMapping(value = "/object")
public class MongoObjectController {
	@Autowired
	private MongoObjectService service;
	
	/*
	 * @param Document(BSON)
	 * 
	 * @return the save object
	 */
	@PostMapping
	public ResponseEntity<Object> save(@RequestBody String entity){
		Object saveObeject = this.service.MongoObjectSave(entity);
			return new ResponseEntity<Object>(saveObeject, HttpStatus.CREATED);
	}
	/*
	 * @return all document
	 */
	@GetMapping
	public ResponseEntity<List<EntityMaster>> findAll(){
		return new ResponseEntity<>(this.service.findAll(),HttpStatus.OK);
	}
}
