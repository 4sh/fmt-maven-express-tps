package fr.maven.express;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MyClassTest {

    @Test
    void displayCurrentJavaVersion() {
        // Given
        int i = 0;
        MyClass myClass = new MyClass();
        // When
        int nextInt = myClass.getNextInt(i);
        // Then
        assertEquals(1, nextInt);
    }
}
