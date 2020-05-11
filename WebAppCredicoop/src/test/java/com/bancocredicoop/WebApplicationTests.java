package com.bancocredicoop;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

import  org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.bancocredicoop.model.Usuario;
import com.bancocredicoop.repo.IUsuarioRepo;
@RunWith(SpringRunner.class)
@SpringBootTest
class WebApplicationTests {

	@Autowired // Anotacion JPA
	private IUsuarioRepo repo;
	
	@Autowired 
	private BCryptPasswordEncoder encoder;
	
	@Test
	void crearUserTest() {
		
		Usuario user= new Usuario();
		user.setId(2);
		user.setNombre("Fernando Iturbe");
		user.setClave(encoder.encode("123"));
		
		Usuario ret = repo.save(user);//la entidad es metida en la BBDD
		
		assertTrue(ret.getClave().equalsIgnoreCase(user.getClave()));   
	}

}
