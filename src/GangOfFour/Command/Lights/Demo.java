package GangOfFour.Command.Lights;

public class Demo {

    public static void main(String[] args) {

        RemoteControl control = new RemoteControl();
        Light light = new Light();
        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);
        Command lightsReplace = new LightReplaceCommand(light);

        // switch on
        control.setCommand(lightsOn);
        control.pressButton();

        // switch off
        control.setCommand(lightsOff);
        control.pressButton();

        // replace and switch on
        control.setCommand(lightsReplace);
        control.pressButton();
    }
}
