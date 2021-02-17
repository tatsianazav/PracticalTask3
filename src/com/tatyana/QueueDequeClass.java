package com.tatyana;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDequeClass {

    public void doctorPatients() {
        Deque<Integer> patients = new LinkedList<Integer>();
        patients.add(8);
        patients.add(5);
        patients.add(4);
        int counter = 1;
        while (patients.size() > 1) {
            if (counter % 3 == 0) {
                System.out.println(patients.pollFirst());
            }
            System.out.println(patients.pollLast());;
            counter++;
            patients.add((int)(Math.random() * 100));
            System.out.println(patients);
        }
    }
}
