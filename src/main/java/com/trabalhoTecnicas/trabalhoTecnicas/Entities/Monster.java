package com.trabalhoTecnicas.trabalhoTecnicas.Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Monster {
    protected int hp;
    protected int mp;
    protected int strength;
    protected int dexterity;
    protected int constitution;
    protected int intelligence;
    protected int wisdom;
    protected int charisma;
    protected int level;
    protected MONSTER_TYPE mtype = null;
    // Random access is important
    protected final List<Item> loot = new ArrayList<Item>();


    public Monster(MonsterBuilder mb){
        this.strength = mb.getStrength();
        this.dexterity = mb.getDexterity();
        this.constitution = mb.getConstitution();
        this.intelligence = mb.getIntelligence();
        this.wisdom = mb.getWisdom();
        this.charisma = mb.getCharisma();
        this.level = 1+(strength+dexterity+constitution+intelligence+wisdom+charisma)/60;
        this.mtype = mb.getType();
        this.hp = calculateHP();
        this.mp = calculateMP();
    }

    // Factory Monster method
    public static Monster getInstanceOf(MONSTER_TYPE mt)throws IllegalArgumentException{
        MonsterBuilder mb = new MonsterBuilder();
        Random dice = new Random();
        mb.setMonsterType(mt);
        switch(mt){
            case ANTIMAGE:
                mb.setStr(10+dice.nextInt(5)).setDex(10+dice.nextInt(6)).setCon(10+dice.nextInt(10)).setInt(12+dice.nextInt(10)).setWis(10+dice.nextInt(20)).setChar(10+dice.nextInt(6));
                return mb.returnMonster();
            case BRUISER:
                mb.setStr(12+dice.nextInt(12)).setDex(10+dice.nextInt(16)).setCon(10+dice.nextInt(10)).setInt(10+dice.nextInt(5)).setWis(10+dice.nextInt(2)).setChar(10+dice.nextInt(6));
                return mb.returnMonster();
            case BURSTER:
                mb.setStr(12+dice.nextInt(6)).setDex(12+dice.nextInt(14)).setCon(10+dice.nextInt(10)).setInt(10+dice.nextInt(2)).setWis(10+dice.nextInt(4)).setChar(12+dice.nextInt(6));
                return mb.returnMonster();
            default:
                throw new IllegalArgumentException("Not a valid monster type");
        }
    }
    public int calculateHP(){
        return constitution * 5 + 16;
    }
    public  int calculateMP(){
        return intelligence * 6 + 10;
    }
    public abstract int attack(Character c);
    public boolean isAlive(){
        return hp > 0;
    }

    public Item getLoot(){
        if(this.isAlive()){
            return null;
        }
        Random luck = new Random();
        int rng = luck.nextInt(loot.size()+5);
        if(rng < loot.size()){
            return loot.get(rng);
        }else{
            return null;
        }
    }

    public int getStrength(){
        return strength;
    }
    public int getDexterity(){
        return dexterity;
    }
    public int getConstitution(){
        return constitution;
    }
    public int getIntelligence(){
        return intelligence;
    }
    public int getWisdom(){
        return wisdom;
    }
    public int getCharisma(){
        return charisma;
    }
    public int getHP(){
        return hp;
    }
    public int getMP(){
        return mp;
    }
    public int getLevel(){
        return level;
    }
    public MONSTER_TYPE getType(){
        return mtype;
    }
    public Monster addLoot(Item i){
        loot.add(i);
        return this;
    }
}