package com.trabalhoTecnicas.trabalhoTecnicas.CasosDeUso;

import java.util.List;

import com.trabalhoTecnicas.trabalhoTecnicas.Entities.Rogue;

import org.springframework.data.repository.CrudRepository;

public interface RepositorioRogue extends CrudRepository<Rogue, String> {
    List<Rogue> findByNome(String name);
    List<Rogue> findAll();
}