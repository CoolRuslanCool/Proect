package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
        bbb ff = new bbb();
        // write your code here
        ArrayList<Integer> list = ff.makeArrayList();
        for (int a=0;a<10;a++) {
            list.add(a,((int)(Math.random()*20)));
        }
        for (Integer f:list) {
            System.out.println(f);
        }

    }
}
