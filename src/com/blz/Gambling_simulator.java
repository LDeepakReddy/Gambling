package com.blz;


public class Gambling_simulator {
    public static final int DAY_STAKE = 100;
    public static final int BET = 1;
    public static final int RESIGN_MARGIN = (DAY_STAKE / 100) * 50;
    public static final int Winning_resign = DAY_STAKE + RESIGN_MARGIN;
    public static final int Losing_resign = DAY_STAKE - RESIGN_MARGIN;

    public static void main(String[] args) {
        int totalCash = DAY_STAKE;
        System.out.println("initial stake is " + DAY_STAKE + "$  and bet is " + BET + "$");

        while (totalCash < Winning_resign && totalCash > Losing_resign) {
            int random = (int) (Math.random() * 10) % 2;
            if (random == 1) {
                System.out.println("Bet won");
                totalCash = totalCash + BET;
                System.out.println("Total amount is " + totalCash + "$");
            } else {
                System.out.println("Bet loses");
                totalCash = totalCash - BET;
                System.out.println("Remaining amount is " + totalCash + "$");
            }
        }
        if (totalCash == Winning_resign) {
            System.out.println("Player won by " + totalCash + "$");
        } else {
            System.out.println("Player lost by " + totalCash + "$");
        }
    }

}



