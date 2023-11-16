package LabMid;

import java.util.List;

public class Computer {

    int computerNo;
    String OS;
    List<String> tools;

    public Computer(int computerNo, String OS, List<String> tools) {
        this.computerNo = computerNo;
        this.OS = OS;
        this.tools = tools;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "computerNo=" + computerNo +
                ", OS='" + OS + '\'' +
                ", tools=" + tools +
                '}';
    }
}
