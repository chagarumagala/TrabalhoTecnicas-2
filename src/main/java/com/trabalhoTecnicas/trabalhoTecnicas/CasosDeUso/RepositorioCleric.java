package com.trabalhoTecnicas.trabalhoTecnicas.CasosDeUso;

import java.util.List;

import com.trabalhoTecnicas.trabalhoTecnicas.Entities.Cleric;

import org.springframework.data.repository.CrudRepository;

public interface RepositorioCleric extends CrudRepository<Cleric, String> {
    List<Cleric> findByNome(String name);
    List<Cleric> findAll();
}