package fr.maven.express;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MyModule1ClassTest {

    private final MyModule1Class myClass = new MyModule1Class();

    @Test
    void displayCurrentJavaVersion() {
        // Given
        int i = 0;
        // When
        int nextInt = myClass.getNextInt(i);
        // Then
        assertEquals(1, nextInt);
    }
}
