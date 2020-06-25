package com.trabalhoTecnicas.trabalhoTecnicas.Entities;

public class Item {
    private String name;
    private String description;
    private boolean isConsumable;

    public Item(String name, String description, boolean isConsumable){
        this.name = name;
        this.description = description;
        this.isConsumable = isConsumable;
    }

    public boolean isConsumable(){
        return isConsumable;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
}