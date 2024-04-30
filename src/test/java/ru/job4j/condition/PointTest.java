package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to80then8() {
        double expected = 8;
        Point a = new Point(0, 0);
        Point b = new Point(8, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when04to00then4() {
        double expected = 4;
        Point a = new Point(0, 4);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to200then18() {
        double expected = 18;
        Point a = new Point(2, 0);
        Point b = new Point(20, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}