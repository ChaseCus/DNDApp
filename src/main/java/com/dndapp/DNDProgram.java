package com.dndapp;

import java.util.Scanner;

public class DNDProgram {
    public static Character character = new Character();
    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){


    }
    public static void charSetUp(){
        System.out.println("What do they call you?");
        String name = userInput.nextLine();
        character.setCharName(name);

        System.out.println("What race are you?");
        System.out.println("1. Dragonborn \n2. Half-Orc \n3. High Elf \n4. Human \n5. Tiefling" );
        int raceNumber = userInput.nextInt();
        String race = "";

        switch (raceNumber){
            case 1: character.setCharRace("DragonBorn");
                break;
            case 2: character.setCharRace("Half-Orc");
                break;
            case 3: character.setCharRace("High Elf");
                break;
            case 4: character.setCharRace("Human");

                break;
            case 5: character.setCharRace("Tiefling");
                break;
        }

        System.out.println("What class are you?");
        System.out.println("1. Barbarian \n2. Bard \n3. Cleric  \n4. Druid \n5. Fighter \n6. Monk \n7. Paladin \n8. Ranger \n9. Rogue \n10. Sorcerer \n11. Warlock \n12. Wizard" );
        int classNumber = userInput.nextInt();


        switch (classNumber){
            case 1: character.setCharClass("Barbarian");
                break;
            case 2: character.setCharClass("Bard");
                break;
            case 3: character.setCharClass("Cleric");
                break;
            case 4: character.setCharClass("Druid");
                break;
            case 5: character.setCharClass("Fighter");
                break;
            case 6: character.setCharClass("Monk");
                break;
            case 7: character.setCharClass("Paladin");
                break;
            case 8: character.setCharClass("Ranger");
                break;
            case 9: character.setCharClass("Rogue");
                break;
            case 10: character.setCharClass("Sorcerer");
                break;
            case 11: character.setCharClass("Warlock");
                break;
            case 12: character.setCharClass("Wizard");
                break;
        }
    }
}
