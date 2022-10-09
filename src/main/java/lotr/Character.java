package lotr;

class Character {
  protected int power;
  protected int hp;
  public void kick(Character enemy) {

  }

  @Override
  public String toString() {
    return "lotr."+this.getClass().getSimpleName() + "{" +
            "hp=" + hp +
            ", power=" + power +
            '}';
  }

  public boolean isAlive() {
    if (this.hp > 0){
      return true;
    }
    return false;
  }

  public int getHp() {
    return this.hp;
  }

  public void setHp(int hp) {
    if (hp < 0){
      this.hp = 0;
    }
    else{
      this.hp = hp;
    }
  }

  public int getPower() {
    return this.power;
  }

  public void setPower(int power) {
    this.power = power;
  }
}

