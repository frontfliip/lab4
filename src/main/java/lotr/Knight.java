package lotr;

import java.util.concurrent.ThreadLocalRandom;

public class Knight extends EliteFighter{
   public Knight() {
      this.hp = ThreadLocalRandom.current().nextInt(2, 13);
      this.power = ThreadLocalRandom.current().nextInt(2, 13);
   }
}
