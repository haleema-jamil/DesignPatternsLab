package GangOfFour.Observer.EventManagement;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
