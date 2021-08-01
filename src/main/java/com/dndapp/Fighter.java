package com.dndapp;

import com.dndapp.*;

import java.util.List;

public class Fighter {


    private List<Integer> attributeList = diceRoll.attributeDice();
    private int strengthAtt = attributeList.get(0);
    private int constitutionAtt = attributeList.get(1);
    private int dexterityAtt = attributeList.get(2);
    private int intelligenceAtt = attributeList.get(3);
    private int wisdomAtt = attributeList.get(4);
    private int charismaAtt = attributeList.get(5);



    public int getStrengthAtt() {
        return strengthAtt;
    }

    public int getConstitutionAtt() {
        return constitutionAtt;
    }

    public int getDexterityAtt() {
        return dexterityAtt;
    }

    public int getIntelligenceAtt() {
        return intelligenceAtt;
    }

    public int getWisdomAtt() {
        return wisdomAtt;
    }

    public int getCharismaAtt() {
        return charismaAtt;
    }
}
