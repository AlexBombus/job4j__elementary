package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void whenAllIsTrue() {
        boolean[] input = {true, true, true, true};
        boolean expected = true;
        boolean result = Check.mono(input);
        assertThat(result, is(expected));
    }

    @Test
    public void whenAllIsFalse() {
        boolean[] input = {false, false, false, false};
        boolean expected = true;
        boolean result = Check.mono(input);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSomeIsDifferent() {
        boolean[] input = {true, true, false, true};
        boolean expected = false;
        boolean result = Check.mono(input);
        assertThat(result, is(expected));
    }
}