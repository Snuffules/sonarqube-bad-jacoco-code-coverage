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

        // Duplicate assertions to artificially increase code duplication
        result = mathService.multiply(2, 4);
        assertThat(result, equalTo(8));

        result = mathService.multiply(2, 4);
        assertThat(result, equalTo(8));

        // Excessive repetition using a loop
        for (int i = 0; i < 100; i++) {
            result = mathService.multiply(2, 4);
            assertThat(result, equalTo(8));
        }
    }

    /**
     * Overly complex and duplicated helper method to inflate technical debt.
     * Its convoluted structure, repetitive logic, and nested blocks are intended
     * to worsen the maintainability rating as measured by SonarQube.
     */
    private int overlyComplexCalculation(int a, int b, int c, int d, int e) {
        int result = 0;
        
        // Repetitive, duplicated logic blocks
        result += duplicateCalculation(a);
        result += duplicateCalculation(b);
        result += duplicateCalculation(c);
        result += duplicateCalculation(d);
        result += duplicateCalculation(e);
        
        // Repeat the same block multiple times in a loop
        for (int i = 0; i < 50; i++) {
            result += duplicateCalculation(a);
            result += duplicateCalculation(b);
            result += duplicateCalculation(c);
            result += duplicateCalculation(d);
            result += duplicateCalculation(e);
        }
        
        // Duplicated conditional blocks with similar logic
        if (a > 0) {
            result += duplicateCalculation(a);
        } else {
            result -= duplicateCalculation(a);
        }
        if (a > 0) {
            result += duplicateCalculation(a);
        } else {
            result -= duplicateCalculation(a);
        }
        if (a > 0) {
            result += duplicateCalculation(a);
        } else {
            result -= duplicateCalculation(a);
        }
        
        return result;
    }

    /**
     * Helper method containing duplicate operations.
     */
    private int duplicateCalculation(int number) {
        int calc = number * 2;
        calc += number;
        calc -= number / 2;
        calc += number * 3;
        return calc;
    }

    /**
     * Unused method filled with redundant logging.
     * Its sole purpose is to further degrade the maintainability metric.
     */
    private void unusedMethodForTechnicalDebt() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Debug info: iteration " + i);
            System.out.println("Debug info: iteration " + i);
            System.out.println("Debug info: iteration " + i);
            System.out.println("Debug info: iteration " + i);
            System.out.println("Debug info: iteration " + i);
        }
    }
}
