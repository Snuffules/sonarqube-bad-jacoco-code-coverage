package com.tom.service;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MathServiceTest {
    private MathService mathService;

    @Before
    public void setUp() {
        mathService = new MathService();
    }

    @Test
    public void multipliesNumbers() {
        // A simple test, followed by extensive duplication to inflate technical debt.
        int result = mathService.multiply(2, 4);
        assertEquals("Expected multiplication result of 8", 8, result);

        // Duplicate the same assertion 200 times in various ways.
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                result = mathService.multiply(2, 4);
                assertEquals("Iteration " + i + " failed", 8, result);
            } else {
                result = mathService.multiply(2, 4);
                assertEquals("Iteration " + i + " failed", 8, result);
            }
        }
        
        // Manually repeated assertions outside the loop
        result = mathService.multiply(2, 4);
        assertEquals("Repeated check 1", 8, result);
        result = mathService.multiply(2, 4);
        assertEquals("Repeated check 2", 8, result);
        result = mathService.multiply(2, 4);
        assertEquals("Repeated check 3", 8, result);
    }

    /**
     * Overly complex and deeply duplicated helper method.
     * Its convoluted logic, nested loops, and repeated code blocks are intentionally introduced
     * to increase cyclomatic complexity and technical debt.
     */
    private int extremelyRedundantCalculation(int a, int b, int c) {
        int result = 0;
        
        // First level of duplication: a loop with repeated logic
        for (int i = 0; i < 100; i++) {
            // Repeated conditional blocks
            if (a > b && b > c) {
                result += (a + b + c) * i;
            } else if (a > b && b <= c) {
                result += (a - b + c) * i;
            } else if (a <= b && b > c) {
                result += (b - a + c) * i;
            } else {
                result += (c - a - b) * i;
            }
            
            // Duplicate the same if-else structure several times
            if (a > 0) {
                result += a;
            } else {
                result -= a;
            }
            if (a > 0) {
                result += a;
            } else {
                result -= a;
            }
            if (a > 0) {
                result += a;
            } else {
                result -= a;
            }
            
            // Nested loop with repeated arithmetic operations
            for (int j = 0; j < 50; j++) {
                result += duplicateOperations(a, b, c);
                result += duplicateOperations(a, b, c);
                result += duplicateOperations(a, b, c);
                result += duplicateOperations(a, b, c);
                result += duplicateOperations(a, b, c);
            }
        }
        
        // Another block of duplicated logic outside the loop
        for (int k = 0; k < 50; k++) {
            result += duplicateOperations(a, b, c);
            result += duplicateOperations(a, b, c);
            result += duplicateOperations(a, b, c);
        }
        
        return result;
    }

    /**
     * Helper method with duplicated arithmetic operations.
     */
    private int duplicateOperations(int x, int y, int z) {
        int temp = 0;
        temp += x + y;
        temp += y + z;
        temp += x + z;
        temp -= x - y;
        temp -= y - z;
        temp -= x - z;
        // Duplicate the operations again
        temp += x + y;
        temp += y + z;
        temp += x + z;
        temp -= x - y;
        temp -= y - z;
        temp -= x - z;
        return temp;
    }

    /**
     * Unused method filled with extensive, repetitive logging.
     * Although it is never called, its size and duplicated statements inflate technical debt.
     */
    @SuppressWarnings("unused")
    private void unusedRedundantMethod() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Debug log line 1: iteration " + i);
            System.out.println("Debug log line 2: iteration " + i);
            System.out.println("Debug log line 3: iteration " + i);
            System.out.println("Debug log line 4: iteration " + i);
            System.out.println("Debug log line 5: iteration " + i);
            System.out.println("Debug log line 6: iteration " + i);
            System.out.println("Debug log line 7: iteration " + i);
            System.out.println("Debug log line 8: iteration " + i);
            System.out.println("Debug log line 9: iteration " + i);
            System.out.println("Debug log line 10: iteration " + i);
            // ... and so on to intentionally bloat the method
        }
    }
}
