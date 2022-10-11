package lotr;

import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class CharacterFactory {

   /**
    * returns random instance of any existing character
    */
   public Character createCharacter() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
      Reflections reflections = new Reflections("lotr");
      List<Class<? extends Character>> classes =
              reflections.getSubTypesOf(Character.class)
              .stream()
              .filter(k -> !Modifier.isAbstract(k.getModifiers()))
              .collect(Collectors.toList());

      int randomElementIndex
              = ThreadLocalRandom.current().nextInt(classes.size());
      return classes.get(randomElementIndex).getDeclaredConstructor().newInstance();

   }

   public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
      CharacterFactory c = new CharacterFactory();
      c.createCharacter();
   }
}