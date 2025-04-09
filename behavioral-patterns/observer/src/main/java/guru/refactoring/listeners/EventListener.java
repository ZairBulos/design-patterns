package guru.refactoring.listeners;

import java.io.File;

/**
 * Subscriber
 */
public interface EventListener {
    void update(String eventType, File file);
}
