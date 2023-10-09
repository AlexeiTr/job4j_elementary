package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TurnTest {
    @Test
    void whenTurnArrayWithNotEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{4, 1, 5, 6, 2, 9, 10};
        int[] result = Turn.back(input);
        int[] expected = new int[]{10, 9, 2, 6, 5, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[]{2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }
}