package com.trabalhoTecnicas.trabalhoTecnicas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.trabalhoTecnicas.trabalhoTecnicas.Entities.MONSTER_TYPE;
import com.trabalhoTecnicas.trabalhoTecnicas.Entities.Monster;
import com.trabalhoTecnicas.trabalhoTecnicas.Entities.MonsterBuilder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MonsterBuilderTests {
    MonsterBuilder bd;
    @BeforeEach
    public void initializeMB(){
        bd = new MonsterBuilder();
    }
    @Test
    public void lowStr(){
        assertThrows(IllegalArgumentException.class, () -> bd.setStr(4));
    }
    @Test
    public void lowDex(){
        assertThrows(IllegalArgumentException.class, () -> bd.setDex(4));
    }
    @Test
    public void lowCon(){
        assertThrows(IllegalArgumentException.class, () -> bd.setCon(4));
    }
    @Test
    public void lowInt(){
        assertThrows(IllegalArgumentException.class, () -> bd.setInt(4));
    }
    @Test
    public void lowWis(){
        assertThrows(IllegalArgumentException.class, () -> bd.setWis(4));
    }
    @Test
    public void lowChar(){
        assertThrows(IllegalArgumentException.class, () -> bd.setChar(4));
    }
    @Test
    public void typeNotSet(){
        assertThrows(IllegalArgumentException.class, () -> bd.returnMonster());
    }
    @Test
    public void acceptTens(){
        bd.setStr(10).setDex(10).setCon(10).setInt(10).setWis(10).setChar(10).setMonsterType(MONSTER_TYPE.BRUISER);
        Monster m = bd.returnMonster();
        assertEquals(10, m.getStrength());
        assertEquals(10, m.getDexterity());
        assertEquals(10, m.getConstitution());
        assertEquals(10, m.getIntelligence());
        assertEquals(10, m.getWisdom());
        assertEquals(10, m.getCharisma());
        assertEquals(132, m.getHP());
        assertEquals(MONSTER_TYPE.BRUISER, m.getType());
    }
    @Test
    public void generalConstruction(){
        bd.setStr(10).setDex(11).setCon(12).setInt(13).setWis(14).setChar(15).setMonsterType(MONSTER_TYPE.BURSTER);
        Monster m = bd.returnMonster();
        assertEquals(10, m.getStrength());
        assertEquals(11, m.getDexterity());
        assertEquals(12, m.getConstitution());
        assertEquals(13, m.getIntelligence());
        assertEquals(14, m.getWisdom());
        assertEquals(15, m.getCharisma());
        assertEquals(76, m.getHP());
        assertEquals(MONSTER_TYPE.BURSTER, m.getType());

    }
    @Test
    public void antiMage(){
        bd.setStr(10).setDex(11).setCon(12).setInt(13).setWis(14).setChar(15).setMonsterType(MONSTER_TYPE.ANTIMAGE);
        Monster m = bd.returnMonster();
        assertEquals(10, m.getStrength());
        assertEquals(11, m.getDexterity());
        assertEquals(12, m.getConstitution());
        assertEquals(13, m.getIntelligence());
        assertEquals(14, m.getWisdom());
        assertEquals(15, m.getCharisma());
        assertEquals(76, m.getHP());
        assertEquals(MONSTER_TYPE.ANTIMAGE, m.getType());
    
    }
    @Test 
    public void automatiAntiMage(){
        Monster m = Monster.getInstanceOf(MONSTER_TYPE.ANTIMAGE);
        assertTrue(m.getStrength()>= 10);
        assertTrue(m.getDexterity()>=10);
        assertTrue(m.getConstitution()>=10);
        assertTrue(m.getIntelligence()>=12);
        assertTrue(m.getWisdom()>=10);
        assertTrue(m.getCharisma()>=10);
    }
    @Test 
    public void automaticBruiser(){
        Monster m = Monster.getInstanceOf(MONSTER_TYPE.BRUISER);
        assertTrue(m.getStrength()>= 12);
        assertTrue(m.getDexterity()>=10);
        assertTrue(m.getConstitution()>=10);
        assertTrue(m.getIntelligence()>=10);
        assertTrue(m.getWisdom()>=10);
        assertTrue(m.getCharisma()>=10);
    }
    @Test
    public void automaticBurster(){
        Monster m = Monster.getInstanceOf(MONSTER_TYPE.BURSTER);
        assertTrue(m.getStrength()>= 12);
        assertTrue(m.getDexterity()>=12);
        assertTrue(m.getConstitution()>=10);
        assertTrue(m.getIntelligence()>=10);
        assertTrue(m.getWisdom()>=10);
        assertTrue(m.getCharisma()>=12);
    }

}