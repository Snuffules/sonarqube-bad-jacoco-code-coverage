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
    public void testMultiply() {
        // Hard-coded “magic numbers”
        int result = mathService.multiply(2, 4);
        assertEquals(8, result);
    }

    // Duplicate test method => triggers code duplication
    @Test
    public void testMultiplyAgain() {
        int result = mathService.multiply(2, 4);
        assertEquals(8, result);
    }

    @Test
    public void printPassword() {
        // Using System.out => code smell
        // Also referencing a “service” password (simulated)
        System.out.println("Printing password: supersecret");
    }

    // Overly nested => high cognitive complexity
    @Test
    public void testNesting() {
        int x = 0;
        if (x == 0) {
            if (x >= 0) {
                if (x < 1) {
                    if (true) {
                        if (true) {
                            System.out.println("Deep nesting here...");
                            // Empty catch block => major code smell
                            try {
                                throw new Exception("Forced exception");
                            } catch (Exception e) {
                                // Doing nothing
                            }
                        }
                    }
                }
            }
        }
        // No real assertion => might also be flagged
    }
}
