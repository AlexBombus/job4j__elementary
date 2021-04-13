package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenX2Y10X4Y5Then5Point38() {
        int x1 = 2;
        int y1 = 10;
        int x2 = 4;
        int y2 = 5;
        double expected = 5.38;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(out, expected, 0.01);
    }

     @Test
    public void whenX5Y3X5Y4Then1() {
        int x1 = 5;
        int y1 = 3;
        int x2 = 5;
        int y2 = 4;
        double expected = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(out, expected, 0.01);
    }

     @Test
    public void whenX7Y5X4Y5Then3() {
        int x1 = 7;
        int y1 = 5;
        int x2 = 4;
        int y2 = 5;
        double expected = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(out, expected, 0.01);
    }

}