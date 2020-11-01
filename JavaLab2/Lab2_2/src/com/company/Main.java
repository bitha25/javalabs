package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Supplies supplies = new Supplies();
        Scanner sc = new Scanner(System.in);
        System.out.println("Minutes:");
        supplies.setMinutes(sc.nextInt());
        supplies.costInchiriere();

        System.out.println("Minutes for rent: " + supplies.getMinutes());
        System.out.println("Total time is: " + supplies.getMinutes()/60+
                " hours and " + supplies.getMinutes()%60 + " minutes" );
    }
}
