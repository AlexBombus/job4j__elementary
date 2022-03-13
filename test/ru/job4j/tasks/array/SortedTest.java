package ru.job4j.tasks.array;

import org.junit.Assert;
import org.junit.Test;

public class SortedTest {

    @Test
    public void whenSorted() {
        Assert.assertTrue(Sorted.isSorted(new int[]{1, 2, 3}));
    }

    @Test
    public void whenNotSorted() {
        Assert.assertFalse(Sorted.isSorted(new int[]{1, 3, 2}));
    }
}
