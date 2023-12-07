package GangOfFour.Mediator.ChatRoom;

import java.util.List;

public interface Mediator {
    void sendMessage(User sender, String message, Colleague target);
    void sendMessageToGroup(User sender, String message, List<Colleague> targets);
}
