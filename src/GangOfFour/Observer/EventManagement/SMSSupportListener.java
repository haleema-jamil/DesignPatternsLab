package GangOfFour.Observer.EventManagement;

import java.io.File;

public abstract class SMSSupportListener implements EventListener{
    private String SMS;

    public SMSSupportListener(String sms) {
        this.SMS = sms;
    }
    
    public void update(String sms) {
        if (sms.length() <= 160) {
            System.out.println("Sending SMS: " + sms);
        } else {
            System.out.println("Warning: Default SMS is too long. Please define a valid default SMS.");
        }
    }
}
