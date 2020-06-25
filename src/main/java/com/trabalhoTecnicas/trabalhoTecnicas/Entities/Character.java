package com.trabalhoTecnicas.trabalhoTecnicas.Entities;

import java.util.HashSet;
import java.util.Set;

public abstract class Character {
    protected Inventory inventory;
    protected int gold;
    protected int hp;
    protected int mp;
    protected int strength;
    protected int dexterity;
    protected int constitution;
    protected int intelligence;
    protected int wisdom;
    protected int charisma;
    protected int level;
    protected CHAR_TYPE ctype;
    protected Set<Party> parties = new HashSet<Party>();


    public Character(CharacterBuilder cb){
        this.strength = cb.getStrength();
        this.dexterity = cb.getDexterity();
        this.constitution = cb.getConstitution();
        this.intelligence = cb.getIntelligence();
        this.wisdom = cb.getWisdom();
        this.charisma = cb.getCharisma();
        this.level = 1+(strength+dexterity+constitution+intelligence+wisdom+charisma)/50;
        this.hp = calculateHP();
        this.mp = calculateMP();
    }

    // Each class has different HP/MP calculations
    protected abstract int calculateHP();
    protected abstract int calculateMP();


    public int damage(int i){
        return hp -= i;
    }

    public boolean isAlive(){
        return hp > 0;
    }
    public boolean canCast(){
        return mp > 0;
    }

    public void addToParty(Party p) throws IllegalArgumentException{
        if(parties.contains(p)){
            throw new IllegalArgumentException("Already in the party");
        }
        parties.add(p);
    }

    public void removeFromParty(Party p) throws IllegalArgumentException{
        if(parties.contains(p)){
            parties.remove(p);
        }else{
            throw new IllegalArgumentException("Already not in party");
        }
    }

    // Getters / Setters
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
    public int getGold(){
        return gold;
    }
    public CHAR_TYPE getType(){
        return ctype;
    }
    public Inventory getInventory(){
        return inventory;
    }
}