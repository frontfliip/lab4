package lotr;

class Hobbit extends Character{
  public Hobbit(){
    this.hp = 3;
    this.power = 0;
  }
  public void kick(Character enemy) {
    toCry();
  }

  private void toCry() {
    System.out.println("плак плак");
  }

}

