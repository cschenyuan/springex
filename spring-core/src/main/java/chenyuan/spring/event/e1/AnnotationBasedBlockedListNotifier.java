package chenyuan.spring.event.e1;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;

/**
 * @author chenyuan
 */
public class AnnotationBasedBlockedListNotifier {

    private String notificationAddress;

    public AnnotationBasedBlockedListNotifier(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    @EventListener
    @Order(2)
    public void processEvent(BlockedListEvent event) {
        System.out.println("[Sync] Received an event: " + event);
    }

    @EventListener({ContextStartedEvent.class, ContextRefreshedEvent.class})
    public void handleContextStart() {
        System.out.println("Received a context-start or context-refreshed event");
    }

    @EventListener
    @Async
    @Order(1)
    public void processEventAsync(BlockedListEvent event) {
        System.out.println("[Async] Received an event: " + event);
    }
}
