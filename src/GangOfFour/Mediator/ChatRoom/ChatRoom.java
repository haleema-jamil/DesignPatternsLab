package GangOfFour.Mediator.ChatRoom;

import java.util.Date;
import java.util.List;

public class ChatRoom implements Mediator {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }

    @Override
    public void sendMessage(User sender, String message, Colleague target) {
        System.out.println(new Date().toString() + " [" + sender.getName() + "] to [" + target.getName() + "] : " + message);
    }

    @Override
    public void sendMessageToGroup(User sender, String message, List<Colleague> targets) {
        System.out.print(new Date().toString() + " [" + sender.getName() + "] to [");
        for (Colleague target : targets) {
            System.out.print(target.getName() + ", ");
        }
        System.out.println("] : " + message);
    }
}