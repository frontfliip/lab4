package lotr;

import java.util.concurrent.ThreadLocalRandom;

class Knight extends Character{
   public Knight() {
      this.hp = ThreadLocalRandom.current().nextInt(2, 13);
      this.power = ThreadLocalRandom.current().nextInt(2, 13);
   }
   /**
    * like King
    */
   public void kick(Character enemy) {
      enemy.setHp(enemy.getHp() - ThreadLocalRandom.current().nextInt(1, this.power+1));
   }
}
