package com.tatyana;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        QueueDequeClass patients = new QueueDequeClass();
        patients.doctorPatients();

	    ListClass test = new ListClass();
	    test.listTask();

	    Jenga jengaCreatedList = new Jenga();
	    jengaCreatedList.jengaGame(10);

	    int numberOfCards = 10;

        Set<CreditCard> creditCards = new HashSet<>();
        for (int i = 0; i < numberOfCards; i++){
            CreditCard card = new CreditCard((long) (Math.random() * 10000000000000000L));
            creditCards.add(card);
        }
        System.out.println(creditCards.toString());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter login: ");
        String loginValue = scanner.next();
        System.out.println("Please, enter name: ");
        String nameValue = scanner.next();

        MapClass mapClass = new MapClass();
        mapClass.register(loginValue, nameValue);

        System.out.println("Please, enter login of the user you want to delete: ");
        String deleteloginValue = scanner.next();
        mapClass.deleteUser(deleteloginValue);
    }
}
