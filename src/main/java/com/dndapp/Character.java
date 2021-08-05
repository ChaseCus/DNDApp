package com.dndapp;

import java.util.List;

public class Character {


    private String charRace;
    private String charClass;
    private String charName;
    private int hitPoints;
    private int strengthAtt;
    private int dexterityAtt;
    private int constitutionAtt;
    private int intelligenceAtt;
    private int wisdomAtt;
    private int charismaAtt;

    private DiceRoll diceRoll = new DiceRoll();
    private List<Integer> attribute = diceRoll.attributeDice();


    public Character(){
        if (charClass.equals("Fighter")){

            strengthAtt = attribute.get(0);
            dexterityAtt = attribute.get(1);
            constitutionAtt = attribute.get(2);
            intelligenceAtt = attribute.get(3);
            wisdomAtt = attribute.get(4);
            charismaAtt = attribute.get(5);
            hitPoints = 10;

        }
    }

    public String getCharRace() {
        return charRace;
    }

    public void setCharRace(String charRace) {
        this.charRace = charRace;
    }

    public String getCharClass() {
        return charClass;
    }

    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getStrengthAtt() {

        return strengthAtt;
    }

    public void setStrengthAtt(int strengthAtt) {
        this.strengthAtt = strengthAtt;
    }

    public int getDexterityAtt() {
        return dexterityAtt;
    }

    public void setDexterityAtt(int dexterityAtt) {
        this.dexterityAtt = dexterityAtt;
    }

    public int getConstitutionAtt() {
        return constitutionAtt;
    }

    public void setConstitutionAtt(int constitutionAtt) {
        this.constitutionAtt = constitutionAtt;
    }

    public int getIntelligenceAtt() {
        return intelligenceAtt;
    }

    public void setIntelligenceAtt(int intelligenceAtt) {
        this.intelligenceAtt = intelligenceAtt;
    }

    public int getWisdomAtt() {
        return wisdomAtt;
    }

    public void setWisdomAtt(int wisdomAtt) {
        this.wisdomAtt = wisdomAtt;
    }

    public int getCharismaAtt() {
        return charismaAtt;
    }

    public void setCharismaAtt(int charismaAtt) {
        this.charismaAtt = charismaAtt;
    }
}