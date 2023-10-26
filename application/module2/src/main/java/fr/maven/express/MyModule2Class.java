package fr.maven.express;

public class MyModule2Class {

    public String capitalize(String input) {
        // input string is null or empty string ""
        if (null == input || input.isEmpty()) {
            return input;
        }
        // input string is a one character string
        if (input.length() == 1) {
            return input.toUpperCase();
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
}
