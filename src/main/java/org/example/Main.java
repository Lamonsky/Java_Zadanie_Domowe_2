package org.example;

import org.example.MyThreads.PotegiDwojkiGhread;
import org.example.MyThreads.WypisywaczThread;
import org.example.MyThreads.TimerThread;

public class Main {
    public static void main(String[] args) {
        /* Zadanie 1
        try {
            Thread t1 = new PotegiDwojkiGhread(1);
            t1.start();

            Thread.sleep(1000);

            Thread t2 = new PotegiDwojkiGhread(100);
            t2.start();

            Thread.sleep(10000);
            t1.interrupt();
            t2.interrupt();
        }
        catch(InterruptedException e){
            throw new RuntimeException(e);
        }*/
        /* Zadanie 2
        Wypisywacz wypisywacz = new Wypisywacz();
        new WypisywaczThread(wypisywacz).start();
        new WypisywaczThread(wypisywacz).start();
        */
        /*Zadanie 4*/
        new TimerWindow().setVisible(true);
    }
}