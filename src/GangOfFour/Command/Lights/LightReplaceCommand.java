package GangOfFour.Command.Lights;

public class LightReplaceCommand implements Command {

    private Light light;

    public LightReplaceCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.switchOff();
        System.out.println("Replacing the light...");
        // Assume some logic to replace the light
        light.switchOn();
        System.out.println("New light is ON");
    }
}