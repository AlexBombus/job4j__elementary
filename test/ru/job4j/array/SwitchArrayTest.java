package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2to0() {
        int[] input = {7, 9, 5, 0};
        int source = 2;
        int dest = 0;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {5, 9, 7, 0};
        Assert.assertArrayEquals(expected, result);
    }
}
