package com.dndapp;

import java.util.Scanner;

public class DNDProgram {

    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){
        charSetUp();


    }
    public static void charSetUp(){
        System.out.println("What do they call you?");
        String name = userInput.nextLine();


        System.out.println("What race are you?");
        System.out.println("1. Dragonborn \n2. Half-Orc \n3. High Elf \n4. Human \n5. Tiefling" );
        int raceNumber = userInput.nextInt();
        String race = "";

        switch (raceNumber){
            case 1:
                race = "DragonBorn";
                break;
            case 2:
                race = "Half-Orc";
                break;
            case 3:
                race = "High Elf";
                break;
            case 4:
                race = "Human";
                break;
            case 5:
                race = "Tiefling";
                break;
        }

        System.out.println("What class are you?");
        System.out.println("1. Barbarian \n2. Bard \n3. Cleric  \n4. Druid \n5. Fighter \n6. Monk \n7. Paladin \n8. Ranger \n9. Rogue \n10. Sorcerer \n11. Warlock \n12. Wizard" );
        int classNumber = userInput.nextInt();
        String charClass = "";


        switch (classNumber){
            case 1:
                charClass = "Barbarian";
                break;
            case 2:
                charClass = "Bard";
                break;
            case 3:
                charClass = "Cleric";
                break;
            case 4:
                charClass = "Druid";
                break;
            case 5:
                charClass = "Fighter";
                break;
            case 6:
                charClass = "Monk";
                break;
            case 7:
                charClass = "Paladin";
                break;
            case 8:
                charClass = "Ranger";
                break;
            case 9:
                charClass = "Rogue";
                break;
            case 10:
                charClass = "Sorcerer";
                break;
            case 11:
                charClass = "Warlock";
                break;
            case 12:
                charClass = "Wizard";
                break;
        }
        Character character = new Character(name, charClass, race);
        System.out.println(name);
        System.out.println(race);
        System.out.println(charClass);
        System.out.println(character.getCharName());
        System.out.printf("Strength %d Dexterity %d Constitution %d Intelligence %d Wisdom %d Charisma %d",
                character.getStrengthAtt(), character.getDexterityAtt(), character.getConstitutionAtt(),
                character.getIntelligenceAtt() , character.getWisdomAtt(), character.getCharismaAtt());

    }
}
