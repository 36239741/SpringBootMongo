package com.br.mongo.test;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.br.mongo.MongoConectApplication;
import com.br.mongo.MongoConectApplicationTests;

//Usuario
@ActiveProfiles("henrique")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {MongoConectApplicationTests.class, MongoConectApplication.class})
public abstract class AbstractIntegrationTest {
	@Before
	public void beforeTest() {
		
	}
}
