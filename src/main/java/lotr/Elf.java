package lotr;

class Elf extends Character{
   public Elf(){
      this.hp = 10;
      this.power = 10;
   }
   /**
    * kill everybody weaker than him, otherwise decrease the power of character by 1
    */
   public void kick(Character enemy) {
      if (enemy.getPower() < this.hp) {
         enemy.setHp(0);
      } else {
         enemy.setHp(enemy.getHp()-1);
      }
   }
}
