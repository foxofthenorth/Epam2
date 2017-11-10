package com.company;

import java.util.Scanner;

public class Input {
    public static int inputInt()
    {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        return k;
    }
    public static String input()
    {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        return n;
    }
    public static Library[] inLibrary(){
        Library[] st = new Library[7];
        st[0] =  new Library("Гарри Поттер 1","Джоан Роулинг","РОСМЭН",2001,300 ,10.00);
        st[1] =  new Library("Гарри Поттер 2","Джоан Роулинг","РОСМЭН",2002,350 ,11.00);
        st[2] =  new Library("Гарри Поттер 3","Джоан Роулинг","РОСМЭН",2004,400 ,12.00);
        st[3] =  new Library("Гарри Поттер 4","Джоан Роулинг","РОСМЭН",2005,350 ,13.00);
        st[4] =  new Library("Гарри Поттер 5","Джоан Роулинг","РОСМЭН",2007,300 ,14.00);
        st[5] =  new Library("Гарри Поттер 6","Джоан Роулинг","РОСМЭН",2009,350 ,15.00);
        st[6] =  new Library("Гарри Поттер 7","Джоан Роулинг","РОСМЭН",2010,400 ,16.00);
        return st;
    }

}

