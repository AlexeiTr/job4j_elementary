package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;

        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;

            } else {

                result = counter == 1 ? result + Character.toString(symbol) : result + Character.toString(symbol) + counter;
                symbol = input.charAt(i);
                counter = 1;

            }
        }
        return result = counter == 1 ? result + symbol : result + symbol + counter;
    }

}
