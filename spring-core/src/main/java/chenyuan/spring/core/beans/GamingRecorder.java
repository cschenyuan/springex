package chenyuan.spring.core.beans;

import java.util.Date;

/**
 * Created by chenyuan on 2018/11/3.
 */
public class GamingRecorder {

    private Player player;
    private Date start;
    private Date end;

    public GamingRecorder(Player player) {
        this.player = player;
    }

    public void startGaming() {
        this.start = new Date();
        System.out.println("LOG: " + player.getId() + " starts gaming at " + start);
    }

    public void endGaming() {
        this.end = new Date();
        System.out.println("LOG: " + player.getId() + " ends gaming at + " + end);
        System.out.println("Spent: " + (end.getTime() - start.getTime()) + " ms");
    }
}
