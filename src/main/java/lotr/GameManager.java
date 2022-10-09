package lotr;

public class GameManager {

   /**
    * to provide fight between два characters and explain via command
    * line what happens during fight, till both of
    * the characters are alive
    */
   public void fight(Character c1, Character c2) {
      if(c1 instanceof Hobbit && c2 instanceof Hobbit){
         System.out.println("Two Hobbits drown in their own tears");
      }
      System.out.println("The fight is about to start!");
      System.out.println(c1.toString());
      System.out.println(c2.toString());
      System.out.println();
      while (c1.isAlive() && c2.isAlive()) {
         c1.kick(c2);
         System.out.println("The " + c1.getClass().getSimpleName() + " kicks the " + c2.getClass().getSimpleName());
         System.out.println(c1.toString());
         System.out.println(c2.toString());
         System.out.println();
         if (c2.isAlive() == false){
            break;
         }
         c2.kick(c1);
         System.out.println("The " + c2.getClass().getSimpleName() + " kicks the " + c1.getClass().getSimpleName());
         System.out.println(c1.toString());
         System.out.println(c2.toString());
         System.out.println();
      }
      if (c1.isAlive()){
         System.out.println(c1.getClass().getSimpleName() + " won! Flowless victory!");
      } else{
         System.out.println(c2.getClass().getSimpleName() + " won! Flowless victory!");
      }
   }
}
