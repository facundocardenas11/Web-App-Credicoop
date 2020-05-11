package com.bancocredicoop.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancocredicoop.model.Persona;
import com.bancocredicoop.repo.IPersonaRepo;

@RestController
@RequestMapping("/personas")  //Donde va a estar alojada la app web.
public class RestService

{
	
     @Autowired 
     private IPersonaRepo repo;

     
     @GetMapping 
     public List<Persona> listar(){  // Muestra todo.
    	 return repo.findAll();
     }

 
     //RequestBody agarra ese Objeto JSON y lo transforma en Objeto Java.   
     @PostMapping 
     public void insertar(@RequestBody Persona p){
		repo.save(p);
	}
     
     @PutMapping 
     public void modificar(@RequestBody Persona p){
		repo.save(p); // 
	}
     //PathVariable captura la variable indicada por parametro para eliminarla en el repo posteriormente.
     @DeleteMapping(value =  "/{id}")
     public void eliminar(@PathVariable("id") Integer id) {
    	 repo. deleteById(id);
     }
     
 	
 	
}
	


