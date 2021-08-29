package com.dndapp;

import java.util.List;

public class Character {


    private String charRace = "";
    private String charClass = "";
    private String charName = "";
    private int hitPoints;
    private int strengthAtt;
    private int dexterityAtt;
    private int constitutionAtt;
    private int intelligenceAtt;
    private int wisdomAtt;
    private int charismaAtt;


    private DiceRoll diceRoll = new DiceRoll();
    private List<Integer> attributeList = diceRoll.attributeDice();



    public Character(String charName,String charClass,String charRace   ){

        if (charClass.equals("Barbarian")) {
            strengthAtt = attributeList.get(0);
            dexterityAtt = attributeList.get(2);
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

   public String getStrMod(int strengthAtt){
         if (strengthAtt == 4 || strengthAtt == 5){
            return "-3";
        }else if(strengthAtt == 6 || strengthAtt == 7){
             return "-2";
         }else if(strengthAtt == 8 || strengthAtt == 9){
             return "-1";
         }else if(strengthAtt == 10 || strengthAtt == 11){
             return "0";
         }else if(strengthAtt == 12 || strengthAtt == 13){
             return "1";
         }else if(strengthAtt == 14 || strengthAtt == 15){
             return "2";
         }else if(strengthAtt == 16 || strengthAtt == 17){
             return "3";
         }return "4";



    }
    public String getDexMod(int dexterityAtt){
        if (dexterityAtt == 4 || dexterityAtt == 5){
            return "-3";
        }else if(dexterityAtt == 6 || dexterityAtt == 7){
            return "-2";
        }else if(dexterityAtt == 8 || dexterityAtt == 9){
            return "-1";
        }else if(dexterityAtt == 10 || dexterityAtt == 11){
            return "0";
        }else if(dexterityAtt == 12 || dexterityAtt == 13){
            return "1";
        }else if(dexterityAtt == 14 || dexterityAtt == 15){
            return "2";
        }else if(dexterityAtt == 16 || dexterityAtt == 17){
            return "3";
        }return "4";



    }
    public String getConMod(int constitutionAtt){
        if (constitutionAtt == 4 || constitutionAtt == 5){
            return "-3";
        }else if(constitutionAtt == 6 || constitutionAtt == 7){
            return "-2";
        }else if(constitutionAtt == 8 || constitutionAtt == 9){
            return "-1";
        }else if(constitutionAtt == 10 || constitutionAtt == 11){
            return "0";
        }else if(constitutionAtt == 12 || constitutionAtt == 13){
            return "1";
        }else if(constitutionAtt == 14 || constitutionAtt == 15){
            return "2";
        }else if(constitutionAtt == 16 || constitutionAtt == 17){
            return "3";
        }return "4";



    }
    public String getIntMod(int intelligenceAtt){
        if (intelligenceAtt == 4 || intelligenceAtt == 5){
            return "-3";
        }else if(intelligenceAtt == 6 || intelligenceAtt == 7){
            return "-2";
        }else if(intelligenceAtt == 8 || intelligenceAtt == 9){
            return "-1";
        }else if(intelligenceAtt == 10 || intelligenceAtt == 11){
            return "0";
        }else if(intelligenceAtt == 12 || intelligenceAtt == 13){
            return "1";
        }else if(intelligenceAtt == 14 || intelligenceAtt == 15){
            return "2";
        }else if(intelligenceAtt == 16 || intelligenceAtt == 17){
            return "3";
        }return "4";



    }
    public String getWisMod(int wisdomAtt){
        if (wisdomAtt == 4 || wisdomAtt == 5){
            return "-3";
        }else if(wisdomAtt == 6 || wisdomAtt == 7){
            return "-2";
        }else if(wisdomAtt == 8 || wisdomAtt == 9){
            return "-1";
        }else if(wisdomAtt == 10 || wisdomAtt == 11){
            return "0";
        }else if(wisdomAtt == 12 || wisdomAtt == 13){
            return "1";
        }else if(wisdomAtt == 14 || wisdomAtt == 15){
            return "2";
        }else if(wisdomAtt == 16 || wisdomAtt == 17){
            return "3";
        }return "4";



    }
    public String getChaMod(int charismaAtt){
        if (charismaAtt == 4 || charismaAtt == 5){
            return "-3";
        }else if(charismaAtt == 6 || charismaAtt == 7){
            return "-2";
        }else if(charismaAtt == 8 || charismaAtt == 9){
            return "-1";
        }else if(charismaAtt == 10 || charismaAtt == 11){
            return "0";
        }else if(charismaAtt == 12 || charismaAtt == 13){
            return "1";
        }else if(charismaAtt == 14 || charismaAtt == 15){
            return "2";
        }else if(charismaAtt == 16 || charismaAtt == 17){
            return "3";
        }return "4";



    }


}