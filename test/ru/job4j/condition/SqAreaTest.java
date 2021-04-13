package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
        int p = 6;
        double k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(out, expected, 0.01);
    }

    @Test
    public void whenP8K3Then3() {
        int p = 8;
        double k = 3;
        double expected = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(out, expected, 0.01);
    }

    @Test
    public void whenP9K2Then4Dot5() {
        int p = 9;
        double k = 2;
        double expected = 4.5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(out, expected, 0.01);
    }
}