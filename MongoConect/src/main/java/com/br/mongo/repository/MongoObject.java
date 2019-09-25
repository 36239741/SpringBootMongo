package com.br.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.br.mongo.entity.EntityMaster;

@Repository
public interface MongoObject extends MongoRepository<EntityMaster, Long>  {

}
