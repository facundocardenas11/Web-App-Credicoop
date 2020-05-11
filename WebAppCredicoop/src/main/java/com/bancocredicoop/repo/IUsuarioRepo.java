package com.bancocredicoop.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.bancocredicoop.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {

	
	
	 Usuario findByNombre(String nombre); //Uso mi metodo llamando ahaciendo una consulta a la base de datos como si hiciese WHERE NOMBRE== ? ?
}
