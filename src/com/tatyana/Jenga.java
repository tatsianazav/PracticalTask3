package com.tatyana;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import java.util.Arrays;

public class Jenga {

    List<Integer> jengaList = new LinkedList<>();

    public void jengaGame (int listLength) {

        Random rand = new Random();
        while (jengaList.size() < listLength) {
            jengaList.add(rand.nextInt((100 - 1) + 1));
        }
        System.out.println(jengaList);

        Random rand2 = new Random();
        int counter = 1;
        while (counter < listLength) {
                int randomIndex = rand2.nextInt((jengaList.size()-2)-1) +1;
                int randomElement = jengaList.get(randomIndex);
                System.out.println("Taking element " + randomElement + " with index " + randomIndex + " and placing it to the end of the list");
                jengaList.remove(randomIndex);
                jengaList.add(randomElement);
                System.out.println("Final " + jengaList.toString());
            counter++;
        }
    }
    }


