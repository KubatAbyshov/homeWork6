package com.company;

public class Magical extends Player implements HaveSuperable{

    public int superAbilities;

    public Magical (){

    }

    @Override
    public String useSuperAbilities() {
        return ("Magic применил супермагию");

    }
}
