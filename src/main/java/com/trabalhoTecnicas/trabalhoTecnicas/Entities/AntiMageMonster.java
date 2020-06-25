package com.trabalhoTecnicas.trabalhoTecnicas.Entities;

public class AntiMageMonster extends Monster{
    
    public AntiMageMonster(MonsterBuilder mb){
        super(mb);
    }
    public int attack(Character c){
        int base_attack = this.intelligence + this.wisdom;
        switch(c.getType()){
            case MAGE:
                return base_attack * 2;
            case CLERIC:
                return base_attack;
            default:
                return base_attack/2;
        }
    }
}