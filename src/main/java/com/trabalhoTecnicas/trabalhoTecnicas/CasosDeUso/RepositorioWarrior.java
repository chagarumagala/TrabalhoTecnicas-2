package com.trabalhoTecnicas.trabalhoTecnicas.CasosDeUso;

import java.util.List;

import com.trabalhoTecnicas.trabalhoTecnicas.Entities.Warrior;

import org.springframework.data.repository.CrudRepository;

public interface RepositorioWarrior extends CrudRepository<Warrior, String> {
    List<Warrior> findByNome(String name);
    List<Warrior> findAll();
}