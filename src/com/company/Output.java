package com.company;

public class Output {

    public static void show(Library[] lb, int i) {

        System.out.println(lb[i].toString());
    }
    public static  void showTable(Library[] lb){
        System.out.println("Plumbing storage");
        for(int i =0;i< lb.length; i++) {
            show(lb,i);

        }

    }

}
