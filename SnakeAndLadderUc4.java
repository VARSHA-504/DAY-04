package com.SnakeAndLadder;

import java.util.Random;

public class SnakeAndLadderUc4{

    public static void main(String[] args) {
        static final int Snake = 2;
        static final int Ladder = 1;
        static final int Noplay = 0;

        public static void main(String[] args)
        {
            int position = 0;
            System.out.println("Initial Position is "+position);

            while (position<100)
            {
                Random ran = new Random();

                int dice = ran.nextInt(6)+1;
                System.out.println("Dice Outcome "+dice);

                int optionCheck = ran.nextInt(3);
                System.out.println("optionCheck: "+optionCheck);


                if (optionCheck == Ladder)
                {
                    System.out.println("Ladder");
                    position = position + dice;
                }
                else if (optionCheck == Snake)
                {
                    System.out.println("Snake");
                    position = position - dice;
                }
                else
                {
                    System.out.println("NoPlay");
                }
                if (position<0)
                {
                    position =0;
                }
                System.out.println("Position :"+position);
            }
        }

    }
