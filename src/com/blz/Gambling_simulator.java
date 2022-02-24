package com.blz;

public class Gambling_simulator {
    public static final int DAY_STAKE = 100;
    public static final int BET = 1;


    public static void main(String[] args) {
        int totalCash = DAY_STAKE;

        System.out.println("initial stake is " + DAY_STAKE + "$  and bet is " + BET + "$");
        double random = Math.random();
        if (random > 0.5) {
            System.out.println("Bet won");
            totalCash++;

            System.out.println("Total amount is " + totalCash + "$");
        } else {
            System.out.println("Bet loses");
            totalCash--;
        }
    }
}
