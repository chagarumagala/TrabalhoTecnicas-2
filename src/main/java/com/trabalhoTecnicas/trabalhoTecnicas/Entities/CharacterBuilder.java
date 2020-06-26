package com.trabalhoTecnicas.trabalhoTecnicas.Entities;

public class CharacterBuilder {
    private int strength = 5;
    private int dexterity = 5;
    private int constitution = 5;
    private int intelligence = 5;
    private int wisdom = 5;
    private int charisma = 5;
    private CHAR_TYPE type = null;    
    public CharacterBuilder setStr(int i) throws IllegalArgumentException{
        if(i < 5) throw new IllegalArgumentException("Strength can't be less than 5");
        this.strength = i;
        return this;
    }

    public CharacterBuilder setDex(int i)throws IllegalArgumentException{
        if(i < 5) throw new IllegalArgumentException("Dexterity can't be less than 5");
        this.dexterity = i;
        return this;
    }

    public CharacterBuilder setCon(int i)throws IllegalArgumentException{
        if(i < 5) throw new IllegalArgumentException("Constitution can't be less than 5");
        this.constitution = i;
        return this;
    }

    public CharacterBuilder setInt(int i)throws IllegalArgumentException{
        if(i < 5) throw new IllegalArgumentException("Intelligence can't be less than 5");
        this.intelligence = i;
        return this;
    }

    public CharacterBuilder setWis(int i)throws IllegalArgumentException{
        if(i < 5) throw new IllegalArgumentException("Wisdom can't be less than 5");
        this.wisdom = i;
        return this;
    }

    public CharacterBuilder setChar(int i)throws IllegalArgumentException{
        if(i < 5) throw new IllegalArgumentException("Charisma can't be less than 5");
        this.charisma = i;
        return this;
    }

    public CharacterBuilder setType(CHAR_TYPE ct){
        this.type = ct;
        return this;
    }

    public Character returnCharacter() throws IllegalArgumentException{
        if(type == null)
        {
            throw new IllegalArgumentException("Character must be of a class");
        }
        switch(type){
            case CLERIC:
                return new Cleric(this);
            case MAGE:
                return new Mage(this);
            case ROGUE:
                return new Rogue(this);
            case WARRIOR:
                return new Warrior(this);
            default:
                throw new IllegalArgumentException("Character must be of a class");
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
    public CHAR_TYPE getType(){
        return type;
    }
    public int getLevel()
    {
        return (strength+dexterity+constitution+intelligence+wisdom+charisma)/30;
    }
}