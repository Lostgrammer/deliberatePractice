package com.carlosvega.learnJava.arrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //arrayList
        ArrayList<Integer> numberList = new ArrayList<>();
        //methods
//        numberList.add(5);
//        numberList.add(14);
//        numberList.add(16);
//        numberList.add(0,14);
//        System.out.println(numberList.toString());
//        numberList.set(1,100);
//        System.out.println(numberList.toString());
//        numberList.remove(0);
//        System.out.println(numberList.toString());
//        System.out.println(numberList.get(0));
//        System.out.println(numberList.contains(100));
//        System.out.println(numberList.toArray().toString());
//        numberList.clear();
//        System.out.println(numberList);

        //linkedList
        LinkedList<String> linkedList = new LinkedList<>();
        //methods
        linkedList.add("Hola");
        linkedList.add("que");
        linkedList.add("tal");
        System.out.println(linkedList);
        System.out.println(linkedList.poll());
        System.out.println(linkedList);
        System.out.println(linkedList.peek());
        System.out.println(linkedList);
        System.out.println(linkedList.getLast());
        System.out.println(linkedList);


    }
}
