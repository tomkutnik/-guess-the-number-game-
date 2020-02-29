package com.company;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        double randomNumber = Math.random() * 100;
        int randomIntNumber = (int) randomNumber;
        int userNumber;
        System.out.println("CheatMode: " + randomIntNumber);
        do {
            Scanner myScan = new Scanner(System.in);
            System.out.println("Enter your number from 0-100");
            userNumber = myScan.nextInt();
            if (userNumber >= 0 && userNumber <=100){
            if (userNumber == randomIntNumber) {
                System.out.println("Winner!");
            } else if (userNumber > randomIntNumber) {
                System.out.println("Your number is too big!");
            } else {
                System.out.println("Your number is too small!");
            }
            }else{
                System.out.println("I SAID 0-100 NOT:" + userNumber + "!!!");
            }
        }
        while (userNumber != randomIntNumber);
    }
}

