package com.tatyana;

import java.util.*;

public class ListClass {

    public void listTask() {

        List<Integer> randomList = new ArrayList<>();

        System.out.print("Enter any number from 10 to 20: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println ("You entered the number: " + number);
        int count = 1;
        int min = 1;
        int max = 100;
        while (count < number) {
            int randomInt = (int)(Math.random() * (max - min + 1) + min);
            if (count % 2 == 0) {
                randomList.add(randomInt);
            } else {
                randomList.add(0, randomInt);
            }
            count++;
            System.out.println("Our list is: " + randomList);
        }

        int count2 = 1;
        while (randomList.size() > 0) {
            if (count2 % 2 == 0) {
                randomList.remove(0);
            } else {
                randomList.remove(randomList.size() -1);
            }
            count2++;
            System.out.println("Our list is: " + randomList);
        }
    }
}
