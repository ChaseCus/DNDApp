package com.dndapp;

import java.util.List;

public class Character extends DNDProgram {


    DiceRoll diceRoll = new DiceRoll();
    private List<Integer> attributeList = diceRoll.attributeDice();
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



    public Character() {
        if (charClass.equals("Barbarian")) {

            strengthAtt = attributeList.get(0);
            dexterityAtt = attributeList.get(3);
            constitutionAtt = attributeList.get(1);
            intelligenceAtt = attributeList.get(4);
            wisdomAtt = attributeList.get(3);
            charismaAtt = attributeList.get(5);
            hitPoints = 12;


        } else if (charClass.equals("Bard")) {

            strengthAtt = attributeList.get(5);
            dexterityAtt = attributeList.get(1);
            constitutionAtt = attributeList.get(3);
            intelligenceAtt = attributeList.get(2);
            wisdomAtt = attributeList.get(4);
            charismaAtt = attributeList.get(0);
            hitPoints = 8;

        } else if (charClass.equals("Cleric")) {

            strengthAtt = attributeList.get(1);
            dexterityAtt = attributeList.get(5);
            constitutionAtt = attributeList.get(2);
            intelligenceAtt = attributeList.get(3);
            wisdomAtt = attributeList.get(0);
            charismaAtt = attributeList.get(4);
            hitPoints = 8;

        } else if (charClass.equals("Druid")) {

            strengthAtt = attributeList.get(3);
            dexterityAtt = attributeList.get(2);
            constitutionAtt = attributeList.get(1);
            intelligenceAtt = attributeList.get(4);
            wisdomAtt = attributeList.get(0);
            charismaAtt = attributeList.get(5);
            hitPoints = 8;

        } else if (charClass.equals("Fighter")) {

            strengthAtt = attributeList.get(0);
            dexterityAtt = attributeList.get(1);
            constitutionAtt = attributeList.get(2);
            intelligenceAtt = attributeList.get(3);
            wisdomAtt = attributeList.get(4);
            charismaAtt = attributeList.get(5);
            hitPoints = 10;

        } else if (charClass.equals("Monk")) {

            strengthAtt = attributeList.get(0);
            dexterityAtt = attributeList.get(1);
            constitutionAtt = attributeList.get(2);
            intelligenceAtt = attributeList.get(3);
            wisdomAtt = attributeList.get(4);
            charismaAtt = attributeList.get(5);
            hitPoints = 10;

        } else if (charClass.equals("Paladin")) {

            strengthAtt = attributeList.get(3);
            dexterityAtt = attributeList.get(0);
            constitutionAtt = attributeList.get(2);
            intelligenceAtt = attributeList.get(4);
            wisdomAtt = attributeList.get(1);
            charismaAtt = attributeList.get(5);
            hitPoints = 8;

        } else if (charClass.equals("Ranger")) {

            strengthAtt = attributeList.get(5);
            dexterityAtt = attributeList.get(0);
            constitutionAtt = attributeList.get(2);
            intelligenceAtt = attributeList.get(3);
            wisdomAtt = attributeList.get(1);
            charismaAtt = attributeList.get(4);
            hitPoints = 10;

        } else if (charClass.equals("Rogue")) {

            strengthAtt = attributeList.get(6);
            dexterityAtt = attributeList.get(1);
            constitutionAtt = attributeList.get(4);
            intelligenceAtt = attributeList.get(3);
            wisdomAtt = attributeList.get(5);
            charismaAtt = attributeList.get(2);
            hitPoints = 8;

        } else if (charClass.equals("Sorcerer")) {

            strengthAtt = attributeList.get(5);
            dexterityAtt = attributeList.get(4);
            constitutionAtt = attributeList.get(1);
            intelligenceAtt = attributeList.get(2);
            wisdomAtt = attributeList.get(3);
            charismaAtt = attributeList.get(0);
            hitPoints = 6;

        } else if (charClass.equals("Warlock")) {

            strengthAtt = attributeList.get(5);
            dexterityAtt = attributeList.get(4);
            constitutionAtt = attributeList.get(1);
            intelligenceAtt = attributeList.get(3);
            wisdomAtt = attributeList.get(2);
            charismaAtt = attributeList.get(0);
            hitPoints = 8;

        } else if (charClass.equals("Wizard")) {

            strengthAtt = attributeList.get(5);
            dexterityAtt = attributeList.get(2);
            constitutionAtt = attributeList.get(1);
            intelligenceAtt = attributeList.get(0);
            wisdomAtt = attributeList.get(4);
            charismaAtt = attributeList.get(3);
            hitPoints = 6;
        }


        public String getCharRace () {
            return charRace;
        }

        public void setCharRace (String charRace){
            this.charRace = charRace;
        }

        public String getCharClass () {
            return charClass;
        }

        public void setCharClass (String charClass){
            this.charClass = charClass;
        }

        public String getCharName () {
            return charName;
        }

        public void setCharName (String charName){
            this.charName = charName;
        }

        public int getStrengthAtt () {

            return strengthAtt;
        }

        public void setStrengthAtt ( int strengthAtt){
            this.strengthAtt = strengthAtt;
        }

        public int getDexterityAtt () {
            return dexterityAtt;
        }

        public void setDexterityAtt ( int dexterityAtt){
            this.dexterityAtt = dexterityAtt;
        }

        public int getConstitutionAtt () {
            return constitutionAtt;
        }

        public void setConstitutionAtt ( int constitutionAtt){
            this.constitutionAtt = constitutionAtt;
        }

        public int getIntelligenceAtt () {
            return intelligenceAtt;
        }

        public void setIntelligenceAtt ( int intelligenceAtt){
            this.intelligenceAtt = intelligenceAtt;
        }

        public int getWisdomAtt () {
            return wisdomAtt;
        }

        public void setWisdomAtt ( int wisdomAtt){
            this.wisdomAtt = wisdomAtt;
        }

        public int getCharismaAtt () {
            return charismaAtt;
        }

        public void setCharismaAtt ( int charismaAtt){
            this.charismaAtt = charismaAtt;
        }
    }
}