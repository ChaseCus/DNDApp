package com.dndapp;


import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DiceRollTest {
    @Test
    public void diceroll(){
        DiceRoll diceRoll = new DiceRoll();
        List<Integer> actual = diceRoll.attributeDice();
        int expected = 6;
        boolean test = actual.size() == expected;
        Assert.assertTrue(test);
    }


}