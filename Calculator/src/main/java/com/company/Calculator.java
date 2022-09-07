package com.company;

public class Calculator {

    public int divide(int a, int b) {
        if ( b == 0 ) {
            return 0;
        }
        return a/b;
    }

    //Note: 0 is supported for all operations below, but adding MAX and MIN int (would return the wrong number since Java
    // just let numbers "overflow", so 2147483647 + 1 = -2147483648, which is wrong). Instead, returns 0.

    //Addition method
    public int add(int a, int b) {
        if ( a == 2147483647 || b == -2147483648 || b == 2147483647 || a == -2147483648) {
            return 0;
        }
        else
            return a+b;
    }

    //Subtraction method
    public int subtract(int a, int b) {
        if (a == 2147483647 || b == -2147483648 || b == 2147483647 || a == -2147483648) {
            return 0;
        }
        else
            return a-b;
    }

    //Multiplication method
    public int multiply(int a, int b) {
        if (a == 2147483647 || b == -2147483648 || b == 2147483647 || a == -2147483648) {
            return 0;
        }
        else
            return a*b;
    }

}
