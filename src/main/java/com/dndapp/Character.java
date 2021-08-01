package com.dndapp;

public class Character extends Fighter{


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



    public Character(){
        if (charClass.equals("Fighter")){
            Fighter fighter = new Fighter();
            strengthAtt = fighter.getStrengthAtt();
            dexterityAtt = fighter.getDexterityAtt();
            constitutionAtt = fighter.getConstitutionAtt();
            intelligenceAtt = fighter.getIntelligenceAtt();
            wisdomAtt = fighter.getWisdomAtt();
            charismaAtt = fighter.getCharismaAtt();
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