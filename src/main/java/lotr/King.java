package lotr;


import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

class King extends Character{

   public King() {
      this.hp = ThreadLocalRandom.current().nextInt(5, 16);
      this.power = ThreadLocalRandom.current().nextInt(5, 16);
   }
   /**
    * decrease number of hp of the enemy by random
    * number which will be in the range of his power
    */
   public void kick(Character enemy) {
      enemy.setHp(enemy.getHp() - ThreadLocalRandom.current().nextInt(1, this.power+1));
   }
}
