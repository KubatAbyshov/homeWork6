package com.company;

public class Mental extends Player implements HaveSuperable{

    public int superAbilities;

    public Mental (){

    }

    @Override
    public String useSuperAbilities() {
        return ("Mental применил суперпсихоудар");

    }
}
