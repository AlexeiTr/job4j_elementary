package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3number() {
        int[] data = new int[]{9, 8, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{6, 8, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5number() {
        int[] data = new int[]{10, 13, 14, 11, 12};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{10, 11, 12, 13, 14};
        assertThat(result).containsExactly(expected);
    }
}