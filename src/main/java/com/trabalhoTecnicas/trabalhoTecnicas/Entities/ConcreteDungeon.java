package com.trabalhoTecnicas.trabalhoTecnicas.Entities;

import java.util.LinkedList;
import java.util.List;

public class ConcreteDungeon extends Dungeon {
    List<Monster> monsters = new LinkedList<Monster>();
    public ConcreteDungeon(String name, String descr, Monster monster){
        super(name, descr, monster);
    }

    public Dungeon addMonster(Monster m){
        this.monsters.add(m);
        return this;
    }
}