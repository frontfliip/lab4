import lotr.CharacterFactory;
import lotr.GameManager;

public class Demo {
    public static void main(String[] args) {
        GameManager manager = new GameManager();
        CharacterFactory factory = new CharacterFactory();
        manager.fight(factory.createCharacter(), factory.createCharacter());
    }
}
