package com.trabalhoTecnicas.trabalhoTecnicas.Entities;

public class Rogue extends Character{
    final protected CHAR_TYPE ctype = CHAR_TYPE.ROGUE;
    public Rogue(CharacterBuilder cb){
        super(cb);
    }
    protected int calculateHP(){
        return this.constitution * 8 + 6;
    }
    protected int calculateMP(){
        return this.intelligence * 5 + 10;
    }
}