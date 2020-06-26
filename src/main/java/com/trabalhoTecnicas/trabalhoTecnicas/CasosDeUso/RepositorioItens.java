package com.trabalhoTecnicas.trabalhoTecnicas.CasosDeUso;

import java.util.List;

import com.trabalhoTecnicas.trabalhoTecnicas.Entities.Item;

import org.springframework.data.repository.CrudRepository;

public interface RepositorioItens extends CrudRepository<Item, String> {
    List<Item> findByNome(String name);
    List<Item> findAll();
}