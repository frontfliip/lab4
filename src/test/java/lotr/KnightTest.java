package lotr;

import lotr.Knight;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class KnightTest {
    private lotr.Character character;

    @BeforeEach
    public void init() {
        character = new Knight();
    }

    @Test
    public void testIsClass() {
        assertTrue(character instanceof lotr.Character);
    }

    @Test
    public void testHp() {
        assertTrue(character.getHp() >= 2 && character.getHp() <= 12);
    }

    @Test
    public void testPower() {
        assertTrue(character.getPower() >= 2 && character.getPower() <= 12);
    }
}