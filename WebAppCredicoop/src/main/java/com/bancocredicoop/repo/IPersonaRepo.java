package com.bancocredicoop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bancocredicoop.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer> {

}
