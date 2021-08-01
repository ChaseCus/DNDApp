package com.dndapp.charclasses;

import com.dndapp.*;

public class Fighter {
    DiceRoll diceRoll = new DiceRoll();
    private int strengthAtt = diceRoll.attributeDice().get(0);
    private int constitutionAtt = diceRoll.attributeDice().get(1);
    private int dexterityAtt = diceRoll.attributeDice().get(2);
    private int intelligenceAtt = diceRoll.attributeDice().get(3);
    private int wisdomAtt = diceRoll.attributeDice().get(4);
    private int charismaAtt = diceRoll.attributeDice().get(5);



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
