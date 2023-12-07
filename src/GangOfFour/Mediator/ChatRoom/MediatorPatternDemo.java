package GangOfFour.Mediator.ChatRoom;

import java.util.ArrayList;
import java.util.List;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        ChatRoom mediator = new ChatRoom();

        User robert = new User("Robert");
        User john = new User("John");
        University comsatsUniversity = new University("COMSATS University");
        Teacher teacherAli = new Teacher("Teacher Sir Ali");
        User mAli = new User("M Ali");
        User ahmad = new User("Ahmad");
        User ali = new User("Ali");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");

        mediator.sendMessage(mAli, "Message to COMSATS University", comsatsUniversity);
        
        List<Colleague> groupTargets = new ArrayList<>();
        groupTargets.add(comsatsUniversity);
        groupTargets.add(teacherAli);
        groupTargets.add(ahmad);
        groupTargets.add(ali);
        mediator.sendMessageToGroup(mAli, "Group message", groupTargets);
    }
}