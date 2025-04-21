package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SqrtTest {

    @Test
    void testCalcForPerfectSquare() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.calc(), 1e-7);
    }

    @Test
    void testCalcForNonPerfectSquare() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(Math.sqrt(2.0), sqrt.calc(), 1e-7);
    }

    @Test
    void testCalcZero() {
        Sqrt sqrt = new Sqrt(0.0);
        assertEquals(0.0, sqrt.calc(), 1e-4);
    }


    @Test
    void testCalcSmallNumber() {
        Sqrt sqrt = new Sqrt(0.0001);
        assertEquals(Math.sqrt(0.0001), sqrt.calc(), 1e-7);
    }

    @Test
    void testAverage() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(2.5, sqrt.average(2.0, 3.0), 1e-9);
    }

    @Test
    void testImprove() {
        Sqrt sqrt = new Sqrt(4.0);
        double guess = 1.0;
        double improved = sqrt.improve(guess, 4.0);
        assertTrue(improved > guess);
    }

    @Test
    void testGoodTrue() {
        Sqrt sqrt = new Sqrt(4.0);
        assertTrue(sqrt.good(2.0, 4.0));
    }

    @Test
    void testGoodFalse() {
        Sqrt sqrt = new Sqrt(4.0);
        assertFalse(sqrt.good(1.5, 4.0));
    }

    @Test
    void testIterConverges() {
        Sqrt sqrt = new Sqrt(9.0);
        assertEquals(3.0, sqrt.iter(1.0, 9.0), 1e-7);
    }

    @Test
    void testCalcLargeNumber() {
        Sqrt sqrt = new Sqrt(1_000_000);
        assertEquals(1000.0, sqrt.calc(), 1e-5);
    }
}
