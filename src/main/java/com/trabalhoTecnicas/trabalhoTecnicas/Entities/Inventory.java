package com.trabalhoTecnicas.trabalhoTecnicas.Entities;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Inventory {
    private final Map<Item, Integer> inventory = new HashMap<Item, Integer>();

    // It returns Inventory so we can chain adds, duh.
    public Inventory addItem(Item i){
        if(inventory.keySet().contains(i)){
            inventory.put(i, inventory.get(i)+1);
        }else{
            inventory.put(i, 1);
        }
        return this;
    }

    public Inventory removeItem(Item i) throws IllegalArgumentException{
        if(inventory.keySet().contains(i)){
            if(inventory.get(i) > 0){
                inventory.put(i, inventory.get(i)-1);
            } else {
                throw new IllegalArgumentException("Does not have the item");
            }
        } else{
            throw new IllegalArgumentException("Never had the item");
        }
        return this;
    }

    public List<Item> getEmptied(){
        List<Item> returnValue = new LinkedList<Item>();
        for(Item i : inventory.keySet()){
            if(inventory.get(i) == 0){
                returnValue.add(i);
            }
        }
        return returnValue;
    }

}