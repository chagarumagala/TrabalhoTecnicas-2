package com.trabalhoTecnicas.trabalhoTecnicas.Entities;

public class Warrior extends Character{
    final protected CHAR_TYPE ctype = CHAR_TYPE.WARRIOR;
    public Warrior(CharacterBuilder cb){
        super(cb);
    }
    protected int calculateHP(){
        return this.constitution * 10 + 6;
    }
    protected int calculateMP(){
        return this.intelligence * 2 + 10;
    }
}