package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void shouldDividePositives() {

        assertEquals(3, calc.divide(6,2));
        assertEquals(2, calc.divide(80, 39));
        assertEquals(1, calc.divide(105, 100));
    }

    @Test
    public void shouldDivideNegatives() {

        assertEquals(3, calc.divide(-6,-2));
        assertEquals(2, calc.divide(-80, -39));
        assertEquals(1, calc.divide(-105, -100));
    }

    @Test
    public void shouldDivideBothPosAndNeg() {
        assertEquals(-3, calc.divide(6,-2));
        assertEquals(-2, calc.divide(-80, 39));
        assertEquals(-1, calc.divide(105, -100));
    }

    @Test
    public void shouldReturnZero() {
        assertEquals(0, calc.divide(0,0));
        assertEquals(0, calc.divide(0, 1));
        assertEquals(0, calc.divide(105, 0));
    }


    //Testing Add method
    @Test
    public void shouldAddPositives() {

        assertEquals(8, calc.add(6,2));
        assertEquals(119, calc.add(80, 39));
        assertEquals(205, calc.add(105, 100));
    }

    @Test
    public void shouldAddNegatives() {

        assertEquals(-8, calc.add(-6,-2));
        assertEquals(-119, calc.add(-80, -39));
        assertEquals(-205, calc.add(-105, -100));
    }

    @Test
    public void shouldAddBothPosAndNeg() {
        assertEquals(4, calc.add(6,-2));
        assertEquals(41, calc.add(80, -39));
        assertEquals(-5, calc.add(-105, 100));
    }

    @Test
    public void shouldReturnZeroMaxMinIntAddition() {
        assertEquals(0, calc.add(2147483647,1));
        assertEquals(0, calc.add(-2147483648, -1));
    }


    //Testing Subtract method
    @Test
    public void shouldSubtractPositives() {

        assertEquals(4, calc.subtract(6,2));
        assertEquals(30, calc.subtract(80, 50));
        assertEquals(-5, calc.subtract(100, 105));
    }

    @Test
    public void shouldSubtractNegatives() {

        assertEquals(-4, calc.subtract(-6,-2));
        assertEquals(-30, calc.subtract(-80, -50));
        assertEquals(-5, calc.subtract(-105, -100));
    }

    @Test
    public void shouldSubtractBothPosAndNeg() {
        assertEquals(8, calc.subtract(6,-2));
        assertEquals(-119, calc.subtract(-80, 39));
        assertEquals(-205, calc.subtract(-105, 100));
    }

    @Test
    public void shouldReturnZeroMaxMinIntSubtraction() {
        assertEquals(0, calc.subtract(2147483647,-1));
        assertEquals(0, calc.subtract(-2147483648, 1));
    }


    //Testing Multiply method
    @Test
    public void shouldMultiplyPositives() {

        assertEquals(12, calc.multiply(6,2));
        assertEquals(4000, calc.multiply(80, 50));
        assertEquals(10500, calc.multiply(100, 105));
    }

    @Test
    public void shouldMultiplyNegatives() {

        assertEquals(12, calc.multiply(-6,-2));
        assertEquals(4000, calc.multiply(-80, -50));
        assertEquals(10500, calc.multiply(-105, -100));
    }

    @Test
    public void shouldMultiplyBothPosAndNeg() {
        assertEquals(-12, calc.multiply(6,-2));
        assertEquals(-3120, calc.multiply(-80, 39));
        assertEquals(-10500, calc.multiply(-105, 100));
    }

    @Test
    public void shouldReturnZeroMaxMinIntMultiplication() {
        assertEquals(0, calc.multiply(2147483647,-3));
        assertEquals(0, calc.multiply(-2147483648, 2));
    }

    @Test
    public void shouldReturnZeroMultiplication() {
        assertEquals(0, calc.multiply(0,-3));
        assertEquals(0, calc.multiply(-0, 2));
    }


}
