package org.example.MyThreads;

import org.example.Wypisywacz;

public class WypisywaczThread extends Thread{
    private Wypisywacz wypisywacz;
    public Wypisywacz getWypisywacz() {
        return wypisywacz;
    }
    public void setWypisywacz(Wypisywacz wypisywacz) {
        this.wypisywacz = wypisywacz;
    }
    public WypisywaczThread(Wypisywacz wypisywacz){
        this.wypisywacz = wypisywacz;
    }

    @Override
    public void run(){
        for(int i=0;i<300;i++){
            System.out.println(this.threadId());
            getWypisywacz().zmieniwypisztext();
        }
    }
}
