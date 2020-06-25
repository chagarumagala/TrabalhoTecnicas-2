package com.trabalhoTecnicas.trabalhoTecnicas.Entities;

public class BruiserMonster extends Monster{
    
    public BruiserMonster(MonsterBuilder mb){
        super(mb);
    }

    @Override
    public int calculateHP(){
        return 2*super.calculateHP();
    }
    public int attack(Character c){
        int base_attack = this.strength + this.constitution;
        switch(c.getType()){
            case ROGUE:
                return base_attack;
            case WARRIOR:
                return base_attack*2;
            default:
                return base_attack/2;
        }
    }
}