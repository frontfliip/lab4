package lotr;

import java.util.concurrent.ThreadLocalRandom;

public class CharacterFactory {

   /**
    * returns random instance of any existing character
    */
   public Character createCharacter() {

      int num = ThreadLocalRandom.current().nextInt(0, 4);
      switch(num){
         case 0:
            return new Elf();
         case 1:
            return new Hobbit();
         case 2:
            return new King();
         case 3:
            return new Knight();
         default: throw new RuntimeException();
      }
   }
}