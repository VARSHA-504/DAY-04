package com.SnakeAndLadder;

import java.util.Random;

public class SnakeAndLadderUc2 {

    public static void main(String[] args) {
        {
            Random ran = new Random();

            int dice = ran.nextInt(6)+1;
            System.out.println("Dice Outcome : "+dice);
        }
    }
//Dice Outcome 1 to 6 range
