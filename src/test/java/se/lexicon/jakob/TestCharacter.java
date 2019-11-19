package se.lexicon.jakob;

import static org.junit.Assert.*;

import Models.Character;
import org.junit.Before;
import org.junit.Test;

public class TestCharacter
{
    private Character newCharacter;
    private final String characterName = "Conan";

    @Before
    public void initCharacter()
    {
        newCharacter = new Character(characterName);
    }

    @Test
    public void testCharacterName()
    {
        //Arrange


        //Act


        //Assert
        assertEquals(characterName, newCharacter.getName());
    }
}
