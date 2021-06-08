package chenyuan.spring.core.beans;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;

/**
 * Created by chenyuan on 2018/11/3.
 */
public class Player {

    private String id;

    @Autowired
    private Game game;

    public Player() {}

    public Player(Game game) {
        this.id = "player-" + new Random().nextInt(1000);
        this.game = game;
    }

    public String getId() {
        return id;
    }

    public void play() {
        System.out.println("I'm playing " + game.name());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
