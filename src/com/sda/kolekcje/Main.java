package com.sda.kolekcje;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //ArrayList - implementacja tablicowa
        //LinkedList - implementa wiazana


        CustomList<String> customList = new CustomLinkedList<>();

        customList.addTail("Jeden");
        customList.addTail("Dwa");
        customList.addTail("Trzy");
        customList.addTail("Cztery");

        customList.printList();

        List<String> list = new LinkedList<>();

        list.add("Jan");
        list.add("Marcin");
        list.add("Karol");

        for (String l: list){
            System.out.println(l);
        }

    }
}
