package com.trabalhoTecnicas.trabalhoTecnicas.Entities;

public class BursterMonster extends Monster{
    public BursterMonster(MonsterBuilder mb){
        super(mb);
    }

    public int attack(Character c){
        int base_attack = this.dexterity + this.charisma;
        switch(c.getType()){
            case ROGUE:
                return base_attack * 2;
            case CLERIC:
                return base_attack*2;
            default:
                return base_attack/2;
        }
    }
}