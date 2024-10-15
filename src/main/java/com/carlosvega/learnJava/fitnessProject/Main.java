package com.carlosvega.learnJava.fitnessProject;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int multiOption = 0;
        int singleOption = 1;
        int membershipStatus = (int) Math.round(Math.random());
        int singleStatus = (int) Math.round(Math.random() * 3);

        Scanner input = new Scanner(System.in);

        System.out.println("Insert membership card. Press enter to continue. ");
        input.nextLine();
        //debug para comprobar que se cambia el valor de membershipStatus
//        while (membershipStatus == 0){
//            membershipStatus = (int) Math.round(Math.random());
//            System.out.println("no sale 1");
//        }
//        System.out.println("salio");
        System.out.println(membershipStatus);


        if (membershipStatus == 0){
            System.out.println("You have all access");
        }
        else {
            while (singleStatus == 0){
                singleStatus = (int) Math.round(Math.random() * 3);
                System.out.println("no sale diferente valor a 0");
            }
        }
        System.out.println("salio");
            switch (singleStatus){
                case 0:
                    System.out.println();
            }
        }

    }
}
