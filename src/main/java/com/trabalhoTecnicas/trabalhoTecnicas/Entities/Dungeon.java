package com.trabalhoTecnicas.trabalhoTecnicas.Entities;

import java.util.List;

public abstract class Dungeon {
    protected String name;
    protected String descr;
    protected List<Monster> monsters;
    protected int avgLevel;
    public Dungeon(String name, String descr, Monster monster){
        this.name = name;
        this.descr = descr;
        this.addMonster(monster);
        avgLevel = monster.getLevel();
    }
    abstract Dungeon addMonster(Monster m);
    public List<Monster> getMonsterList(){
        return monsters;
    }
    
}