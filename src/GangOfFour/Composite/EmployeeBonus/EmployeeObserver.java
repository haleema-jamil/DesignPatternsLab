package GangOfFour.Composite.EmployeeBonus;

import java.util.Observable;
import java.util.Observer;

public class EmployeeObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Notification received: " + arg.toString());
    }
}