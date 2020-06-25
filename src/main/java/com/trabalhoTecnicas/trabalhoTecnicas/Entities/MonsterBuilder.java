package com.trabalhoTecnicas.trabalhoTecnicas.Entities;

public class MonsterBuilder {
    private int strength = 10;
    private int dexterity = 10;
    private int constitution = 10;
    private int intelligence = 10;
    private int wisdom = 10;
    private int charisma = 10;
    private MONSTER_TYPE type = null;    
    public MonsterBuilder setStr(int i) throws IllegalArgumentException{
        if(i < 10) throw new IllegalArgumentException("Strength can't be less than 10");
        this.strength = i;
        return this;
    }

    public MonsterBuilder setDex(int i)throws IllegalArgumentException{
        if(i < 10) throw new IllegalArgumentException("Dexterity can't be less than 10");
        this.dexterity = i;
        return this;
    }

    public MonsterBuilder setCon(int i)throws IllegalArgumentException{
        if(i < 10) throw new IllegalArgumentException("Constitution can't be less than 10");
        this.constitution = i;
        return this;
    }

    public MonsterBuilder setInt(int i)throws IllegalArgumentException{
        if(i < 10) throw new IllegalArgumentException("Intelligence can't be less than 10");
        this.intelligence = i;
        return this;
    }

    public MonsterBuilder setWis(int i)throws IllegalArgumentException{
        if(i < 10) throw new IllegalArgumentException("Wisdom can't be less than 10");
        this.wisdom = i;
        return this;
    }

    public MonsterBuilder setChar(int i)throws IllegalArgumentException{
        if(i < 10) throw new IllegalArgumentException("Charisma can't be less than 10");
        this.charisma = i;
        return this;
    }
    public MonsterBuilder setMonsterType(MONSTER_TYPE mt){
        this.type = mt;
        return this;
    }

    public Monster returnMonster()throws IllegalArgumentException{
        if(type == null){
            throw new IllegalArgumentException("Monster must be of a type");
        }
        switch(type){
            case ANTIMAGE:
                return new AntiMageMonster(this);
            case BURSTER:
                return new BursterMonster(this);
            case BRUISER:
                return new BruiserMonster(this);
            default:
                throw new IllegalArgumentException("Monster must be of a type");
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
    public MONSTER_TYPE getType(){
        return type;
    }
}