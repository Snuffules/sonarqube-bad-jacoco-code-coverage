package com.tom.service;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MathServiceTest {
    private MathService mathService;

    @Before
    public void setUp() {
        mathService = new MathService();
    }

    @Test
    public void multipliesNumbers() {
        // Original test assertion
        int result = mathService.multiply(2, 4);
        assertThat(result, equalTo(8));
        
        // Duplicate code blocks to artificially increase technical debt
        result = mathService.multiply(2, 4);
        assertThat(result, equalTo(8));
        
        result = mathService.multiply(2, 4);
        assertThat(result, equalTo(8));
        
        result = mathService.multiply(2, 4);
        assertThat(result, equalTo(8));
        
        result = mathService.multiply(2, 4);
        assertThat(result, equalTo(8));
    }
    
    /**
     * This helper method is intentionally overcomplicated and duplicated to increase technical debt.
     */
    private int calculateComplex(int a, int b, int c, int d, int e) {
        int result = 0;
        // First block of duplicated logic
        if (a > 0) {
            result += a;
        } else {
            result -= a;
        }
        if (b > 0) {
            result += b;
        } else {
            result -= b;
        }
        if (c > 0) {
            result += c;
        } else {
            result -= c;
        }
        if (d > 0) {
            result += d;
        } else {
            result -= d;
        }
        if (e > 0) {
            result += e;
        } else {
            result -= e;
        }
        
        // Duplicate the same logic to worsen maintainability
        if (a > 0) {
            result += a;
        } else {
            result -= a;
        }
        if (b > 0) {
            result += b;
        } else {
            result -= b;
        }
        if (c > 0) {
            result += c;
        } else {
            result -= c;
        }
        if (d > 0) {
            result += d;
        } else {
            result -= d;
        }
        if (e > 0) {
            result += e;
        } else {
            result -= e;
        }
        
        return result;
    }
    
    /**
     * An unused method with duplicated statements to further increase the technical debt.
     */
    private void unrefactoredCode() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Processing: " + i);
            System.out.println("Processing: " + i);
            System.out.println("Processing: " + i);
            System.out.println("Processing: " + i);
            System.out.println("Processing: " + i);
        }
    }
}
