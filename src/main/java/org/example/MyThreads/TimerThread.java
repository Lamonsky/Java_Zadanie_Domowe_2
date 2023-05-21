package org.example.MyThreads;

import javax.swing.*;

public class TimerThread extends Thread{
    private JTextField sekundyTextField;

    public JTextField getSekundyTextField() {
        return sekundyTextField;
    }

    public void setSekundyTextField(JTextField sekundyTextField) {
        this.sekundyTextField = sekundyTextField;
    }

    public TimerThread(JTextField sekundyTextField){
        super();
        this.sekundyTextField = sekundyTextField;
    }

    @Override
    public void run() {
        try {
            int sekundy = 1;
            while(sekundy>0) {

                sekundy = Integer.parseInt(sekundyTextField.getText());
                Thread.sleep(1000);
                sekundy--;
                sekundyTextField.setText(sekundy + "");
            }

        }
        catch(InterruptedException ex){}
    }
}
