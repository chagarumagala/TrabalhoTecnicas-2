package com.trabalhoTecnicas.trabalhoTecnicas.Entities;

import java.util.HashSet;
import java.util.Set;

public class Party {
    PartyLeader partyLeader;
    Dungeon dungeon;
    final Set<Character> members = new HashSet<Character>();

    public Party(PartyLeader partyLeader, Dungeon dungeon){
        this.partyLeader = partyLeader;
        members.add(partyLeader.getCharacter());
        this.dungeon = dungeon;
    }
}