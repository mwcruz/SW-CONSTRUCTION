package com.mwcruz;


public class Main {

    public static void main(String[] args) {
	    int big = 200000;
        big = big * big;

        long big2 = 200000;
        big2 = big2 * big2;

        double probability = 1/5;

        double n = 0;
        double sum = 7;
        double average = sum/n;
        System.out.println("probability  " + probability);
        System.out.println("average  " + average);
        System.out.println("big  " + big);
        System.out.println("big2  " + big2);
        System.out.println("Hailstone of 17: " + Hailstone.hailstoneSequence(17));


    }
}



