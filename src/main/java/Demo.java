import lotr.CharacterFactory;
import lotr.GameManager;

import java.lang.reflect.InvocationTargetException;

public class Demo {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        GameManager manager = new GameManager();
        CharacterFactory factory = new CharacterFactory();
        manager.fight(factory.createCharacter(), factory.createCharacter());
    }
}
