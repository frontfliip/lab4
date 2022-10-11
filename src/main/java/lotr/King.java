package lotr;


import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class King extends EliteFighter {

   public King() {
      this.hp = ThreadLocalRandom.current().nextInt(5, 16);
      this.power = ThreadLocalRandom.current().nextInt(5, 16);
   }
}
