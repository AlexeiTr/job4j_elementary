package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class PrimeNumberTest {
    @Test
    void when5() {
        int finish = 5;
        int result = PrimeNumber.calc(finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when11() {
        int finish = 11;
        int result = PrimeNumber.calc(finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2() {
        int finish = 2;
        int result = PrimeNumber.calc(finish);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}