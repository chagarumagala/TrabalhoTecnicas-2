package com.trabalhoTecnicas.trabalhoTecnicas.Entities;

public class PartyLeader {
    private Character itself;
    private Party party;
    public PartyLeader(Character itself, Party party){
        this.itself = itself;
        this.party = party;
    }

    public Character getCharacter(){
        return itself;
    }

    public Party getParty(){
        return party;
    }

}