package com.trabalhoTecnicas.trabalhoTecnicas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.trabalhoTecnicas.trabalhoTecnicas.Entities.CHAR_TYPE;
import com.trabalhoTecnicas.trabalhoTecnicas.Entities.Character;
import com.trabalhoTecnicas.trabalhoTecnicas.Entities.CharacterBuilder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CharacterBuilderTests {
    CharacterBuilder cd;
    @BeforeEach
    public void initializeMB(){
        cd = new CharacterBuilder();
    }
        @Test
    public void lowStr(){
        assertThrows(IllegalArgumentException.class, () -> cd.setStr(4));
    }
    @Test
    public void lowDex(){
        assertThrows(IllegalArgumentException.class, () -> cd.setDex(4));
    }
    @Test
    public void lowCon(){
        assertThrows(IllegalArgumentException.class, () -> cd.setCon(4));
    }
    @Test
    public void lowInt(){
        assertThrows(IllegalArgumentException.class, () -> cd.setInt(4));
    }
    @Test
    public void lowWis(){
        assertThrows(IllegalArgumentException.class, () -> cd.setWis(4));
    }
    @Test
    public void lowChar(){
        assertThrows(IllegalArgumentException.class, () -> cd.setChar(4));
}
@Test 

public void typeNotSet(){
    assertThrows(IllegalArgumentException.class, () -> cd.returnCharacter());
}
@Test
public void acceptFives(){
    cd.setStr(5).setDex(5).setCon(5).setInt(5).setWis(5).setChar(5).setType(CHAR_TYPE.CLERIC);
    Character m = cd.returnCharacter();
    assertEquals(5, m.getStrength());
    assertEquals(5, m.getDexterity());
    assertEquals(5, m.getConstitution());
    assertEquals(5, m.getIntelligence());
    assertEquals(5, m.getWisdom());
    assertEquals(5, m.getCharisma());
    assertEquals(CHAR_TYPE.CLERIC, m.getType());
}
@Test
public void generalConstruction(){
    cd.setStr(10).setDex(11).setCon(12).setInt(13).setWis(14).setChar(15).setType(CHAR_TYPE.MAGE);
    Character m = cd.returnCharacter();
    assertEquals(10, m.getStrength());
    assertEquals(11, m.getDexterity());
    assertEquals(12, m.getConstitution());
    assertEquals(13, m.getIntelligence());
    assertEquals(14, m.getWisdom());
    assertEquals(15, m.getCharisma());
    assertEquals(CHAR_TYPE.MAGE, m.getType());

}
@Test
public void rogue(){
    cd.setStr(10).setDex(16).setCon(12).setInt(12).setWis(14).setChar(15).setType(CHAR_TYPE.ROGUE);
    Character m = cd.returnCharacter();
    assertEquals(10, m.getStrength());
    assertEquals(16, m.getDexterity());
    assertEquals(12, m.getConstitution());
    assertEquals(12, m.getIntelligence());
    assertEquals(14, m.getWisdom());
    assertEquals(15, m.getCharisma());
    assertEquals(102, m.getHP());
    assertEquals(70, m.getMP());
    assertEquals(2,m.getLevel());
    assertEquals(CHAR_TYPE.ROGUE, m.getType());

}
@Test

public void warrior(){
    cd.setStr(50).setDex(11).setCon(17).setInt(13).setWis(14).setChar(10).setType(CHAR_TYPE.WARRIOR);
    Character m = cd.returnCharacter();
    assertEquals(50, m.getStrength());
    assertEquals(11, m.getDexterity());
    assertEquals(17, m.getConstitution());
    assertEquals(13, m.getIntelligence());
    assertEquals(14, m.getWisdom());
    assertEquals(10, m.getCharisma());
    assertEquals(176, m.getHP());
    assertEquals(36, m.getMP());
    assertEquals(3,m.getLevel());
    assertEquals(CHAR_TYPE.WARRIOR, m.getType());

}
@Test

public void cleric(){
    cd.setStr(10).setDex(11).setCon(15).setInt(12).setWis(14).setChar(15).setType(CHAR_TYPE.CLERIC);
    Character m = cd.returnCharacter();
    assertEquals(10, m.getStrength());
    assertEquals(11, m.getDexterity());
    assertEquals(15, m.getConstitution());
    assertEquals(12, m.getIntelligence());
    assertEquals(14, m.getWisdom());
    assertEquals(15, m.getCharisma());
    assertEquals(96, m.getHP());
    assertEquals(146, m.getMP());
    assertEquals(2,m.getLevel());
    assertEquals(CHAR_TYPE.CLERIC, m.getType());

}
@Test

public void mage(){
    cd.setStr(10).setDex(11).setCon(10).setInt(15).setWis(14).setChar(80).setType(CHAR_TYPE.MAGE);
    Character m = cd.returnCharacter();
    assertEquals(10, m.getStrength());
    assertEquals(11, m.getDexterity());
    assertEquals(10, m.getConstitution());
    assertEquals(15, m.getIntelligence());
    assertEquals(14, m.getWisdom());
    assertEquals(80, m.getCharisma());
    assertEquals(44, m.getHP());
    assertEquals(316, m.getMP());
    assertEquals(4,m.getLevel());
    assertEquals(CHAR_TYPE.MAGE, m.getType());

}

}