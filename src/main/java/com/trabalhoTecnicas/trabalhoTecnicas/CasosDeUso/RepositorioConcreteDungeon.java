package com.trabalhoTecnicas.trabalhoTecnicas.CasosDeUso;

import java.util.List;

import com.trabalhoTecnicas.trabalhoTecnicas.Entities.ConcreteDungeon;

import org.springframework.data.repository.CrudRepository;

public interface RepositorioConcreteDungeon extends CrudRepository<ConcreteDungeon, String> {
    List<ConcreteDungeon> findByNome(String name);
    List<ConcreteDungeon> findAll();
}