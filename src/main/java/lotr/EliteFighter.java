package lotr;

import java.util.concurrent.ThreadLocalRandom;

public abstract class EliteFighter extends Character {
    public void kick(Character enemy) {
        enemy.setHp(enemy.getHp() - ThreadLocalRandom.current().nextInt(1, this.power+1));
    }
}
