package chenyuan.spring.event.e1;

import org.springframework.context.ApplicationEvent;

/**
 * @author chenyuan
 */
public class BlockedListEvent extends ApplicationEvent {

    private final String address;
    private final String content;

    public BlockedListEvent(Object source, String address, String content) {
        super(source);
        this.address = address;
        this.content = content;
    }
}
