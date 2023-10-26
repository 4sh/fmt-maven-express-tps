package fr.maven.express;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MyModule2ClassTest {

    private final MyModule2Class myClass = new MyModule2Class();

    @Test
    void testCapitalizeNullString() {
        // Given
        String input = null;
        // When
        String capitalizeResult = myClass.capitalize(input);
        // Then
        assertEquals(null, capitalizeResult);
    }

    @Test
    void testCapitalizeEmptyString() {
        // Given
        String input = "";
        // When
        String capitalizeResult = myClass.capitalize(input);
        // Then
        assertEquals("", capitalizeResult);
    }

    @Test
    void testCapitalizeOneCharacterString() {
        // Given
        String input = "a";
        // When
        String capitalizeResult = myClass.capitalize(input);
        // Then
        assertEquals("A", capitalizeResult);
    }

    @Test
    void testCapitalizeLongString() {
        // Given
        String input = "maven build";
        // When
        String capitalizeResult = myClass.capitalize(input);
        // Then
        assertEquals("Maven build", capitalizeResult);
    }


}
