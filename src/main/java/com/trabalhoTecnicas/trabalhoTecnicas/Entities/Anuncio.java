package com.trabalhoTecnicas.trabalhoTecnicas.Entities;

public class Anuncio {
    private Party party;
    private String descr;
    
    public Anuncio(Party party, String descr){
        this.party = party;
        this.descr = descr;
    }
    public String getDescr(){
        return descr;
    }
    public Party getParty(){
        return party;
    }

}