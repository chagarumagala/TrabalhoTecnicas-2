package com.trabalhoTecnicas.trabalhoTecnicas.Entities;

public class Mage extends Character{
    
    final protected CHAR_TYPE ctype = CHAR_TYPE.MAGE;
    public Mage(CharacterBuilder cb){
        super(cb);
    }

    protected int calculateHP(){
        return this.constitution * 4 + 4;
    }
    protected int calculateMP(){
        return this.intelligence * 20 + 16;
    }
}