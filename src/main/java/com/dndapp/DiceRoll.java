package com.dndapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DiceRoll  {
    private Random dice = new Random();
    private List<Integer> attributeNums = new ArrayList();
    public int dice(){
        for (int i = 0; i < 6; i++){
            int roll1 = dice.nextInt(6);
            int roll2 = dice.nextInt(6);
            int roll3 = dice.nextInt(6);
            int roll4 = dice.nextInt(6);

        }

    }
}
