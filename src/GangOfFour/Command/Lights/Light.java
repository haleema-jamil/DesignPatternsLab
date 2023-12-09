package GangOfFour.Command.Lights;

//Receiver

public class Light {
    private boolean isOn;

    public void switchOn() {
        System.out.println("Light is being switched ON");
        isOn = true;
    }

    public void switchOff() {
        System.out.println("Light is being switched OFF");
        isOn = false;
    }
}