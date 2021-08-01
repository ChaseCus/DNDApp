package com.dndapp;


import java.util.*;

public class DiceRoll  {
    private List<Integer> attributeNums;

    private Random dice = new Random();


    public List<Integer> attributeDice(){

        attributeNums = new ArrayList();
        for (int i = 0; i < 6; i++){
            int[] diceArr = new int[4];
            for(int j = 0; j < 4 ; j++){
                int roll = dice.nextInt(6) + 1;
                diceArr[j] = roll;
            }
            Arrays.sort(diceArr);
            int diceToAdd = diceArr[1] + diceArr[2] + diceArr[3];
            attributeNums.add(diceToAdd);


        }
        Collections.sort(attributeNums);
        Collections.reverse(attributeNums);
        return attributeNums;
    }



}
