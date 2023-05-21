package org.example;

public class Wypisywacz {
    private String text;
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public synchronized void zmieniwypisztext(){
        setText("");
        for(char item : "JAVA JEST NAJLEPSZYM JEZYKIEM NA SWIECIE".toCharArray()){
            setText(getText()+item);
        }
        System.out.println(getText());
    }


}
