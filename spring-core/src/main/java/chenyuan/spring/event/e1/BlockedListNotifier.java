package chenyuan.spring.event.e1;

import org.springframework.context.ApplicationListener;

/**
 *
 * @author chenyuan
 */
public class BlockedListNotifier implements ApplicationListener<BlockedListEvent> {

    private String notificationAddress;

    public BlockedListNotifier(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    @Override
    public void onApplicationEvent(BlockedListEvent event) {
        System.out.println("Received an event: " + event);
    }
}
