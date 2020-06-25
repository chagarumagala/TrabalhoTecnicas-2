package com.trabalhoTecnicas.trabalhoTecnicas.Entities;

public class Cleric extends Character{
    final protected CHAR_TYPE ctype = CHAR_TYPE.CLERIC;
    public Cleric(CharacterBuilder cb){
        super(cb);
    }

    protected int calculateHP(){
        return this.constitution * 6 + 6;
    }
    protected int calculateMP(){
        return this.wisdom * 10 + 6;
    }
    
}