package com.trabalhoTecnicas.trabalhoTecnicas.CasosDeUso;

import java.util.List;

import com.trabalhoTecnicas.trabalhoTecnicas.Entities.Mage;

import org.springframework.data.repository.CrudRepository;

public interface RepositorioMage extends CrudRepository<Mage, String> {
    List<Mage> findByNome(String name);
    List<Mage> findAll();
}