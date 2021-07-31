package com.dndapp.charclasses;

import com.dndapp.*;

public class Fighter {
    DiceRoll diceRoll = new DiceRoll();
    private int strengthAtt = diceRoll.getAttributeNums().get(0);
    private int constitutionAtt = diceRoll.getAttributeNums().get(1);
    private int dexterityAtt = diceRoll.getAttributeNums().get(2);
    private int intelligenceAtt = diceRoll.getAttributeNums().get(3);
    private int wisdomAtt = diceRoll.getAttributeNums().get(4);
    private int charismaAtt = diceRoll.getAttributeNums().get(5);



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
