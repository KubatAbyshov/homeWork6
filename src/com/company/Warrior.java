package com.company;

public class Warrior extends Player implements HaveSuperable {

    public int superAbilities;

    public Warrior (){

    }

    @Override
    public String useSuperAbilities() {
        return("Warrior применил суперудар");

    }
}

