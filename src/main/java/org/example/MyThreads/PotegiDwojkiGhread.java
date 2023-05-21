package org.example.MyThreads;

public class PotegiDwojkiGhread extends Thread{

    private int number;

    public PotegiDwojkiGhread(int number){
        this.number = number;
    }

    @Override
    public void run(){
        number = 1;
        while(true){
            try{ Thread.sleep(3000); }
            catch(InterruptedException ex){ break; }
            setNumber(number*2);
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        System.out.println(number);
    }
}

