package com.company;

import java.util.Arrays;
import java.util.Comparator;


public class Find {
    public static void swich(){
        boolean b = true;
        Output.showTable(Input.inLibrary());
        while (b ) {
            System.out.println("Choose what you need");
            System.out.println("1 to find Author, 2 to Publisher, 3 to publ. year, 4 to show all sort by Publishers, 0 to end work:");
            String n = Input.input();
            switch (n) {
                case "1":
                    System.out.println("Enter the Author");
                    findAuthor(Input.inLibrary(),Input.input());
                    break;
                case "2":
                    System.out.println("Enter the Publisher");
                    findPublisher(Input.inLibrary(),Input.input());
                    break;
                case "3":
                    System.out.println("Enter the publishing year");
                    findYear(Input.inLibrary(),Input.inputInt());
                    break;
                case "4":
                    sort(Input.inLibrary());
                    break;
                case "0":
                    b = false;
                    break;
                default:
                    break;
            }
        }
    }

    public static void findAuthor(Library[] lb,String n){
        int counter = 0;
        for (int i = 0; i < lb.length; i++) {
            if (lb[i].getAuthor().equals(n)) {
                counter++;
                Output.show(lb,i);
            }
        }
        if(counter ==0)
            System.out.println( "Cant find book");
    }

    public static void findPublisher(Library[] lb,String n){
        int counter = 0;
        for (int i = 0; i < lb.length; i++) {
            if (lb[i].getPublisher().equals(n)) {
                counter++;
                Output.show(lb,i);
            }
        }
        if(counter ==0)
            System.out.println( "There is no such book in the library");
    }

    public static void findYear(Library[] lb,int n){
        int counter = 0;
        for (int i = 0; i < lb.length; i++) {
            if (lb[i].getPubl_year()> n) {
                counter++;
                Output.show(lb,i);
            }
        }
        if(counter ==0)
            System.out.println( "There is no such book in the library");
    }

    public static void sort(Library[] lb){
        Arrays.sort(lb,new PublisherComparing());
        Output.showTable(lb);
    }
}


class PublisherComparing implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String name1 = ((Library) o1).getPublisher();
        String name2 = ((Library) o2).getPublisher();
        return name1.compareTo(name2);
    }
}

