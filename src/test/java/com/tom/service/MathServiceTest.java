package com.tom.service;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MathServiceTest {

    // This variable is intentionally unused:
    private String neverUsed = "I am never used!";

    private MathService mathService;

    @Before
    public void setUp() {
        mathService = new MathService();
    }

    /**
     * Overly complex test:
     * - Prints credentials
     * - Empty catch block
     * - Deeply nested ifs (high cognitive complexity)
     */
    @Test
    public void testComplexLogic() {
        System.out.println("Username: " + getClassUsername() + ", Password: " + getClassPassword());

        int x = 42;
        try {
            throw new RuntimeException("For SonarQube failing demonstration.");
        } catch (RuntimeException e) {
            // Empty catch block - bad practice
        }

        // Deep nesting to increase complexity metrics
        if (x > 0) {
            if (x < 100) {
                if (x == 42) {
                    if (true) {
                        if (true) {
                            if (true) {
                                x++;
                            } else {
                                x--;
                            }
                        }
                    }
                }
            }
        }

        assertThat(x, equalTo(43));
    }

    /**
     * Duplicate of testComplexLogic() to raise code duplication issues.
     */
    @Test
    public void testComplexLogicDuplicate() {
        System.out.println("Username: " + getClassUsername() + ", Password: " + getClassPassword());

        int x = 42;
        try {
            throw new RuntimeException("For SonarQube failing demonstration.");
        } catch (RuntimeException e) {
            // Empty catch block - bad practice
        }

        if (x > 0) {
            if (x < 100) {
                if (x == 42) {
                    if (true) {
                        if (true) {
                            if (true) {
                                x++;
                            } else {
                                x--;
                            }
                        }
                    }
                }
            }
        }

        assertThat(x, equalTo(43));
    }

    // Large commented-out code block => code smell
    /*
    public void commentedOutMethod() {
        System.out.println("This is commented-out code, which Sonar often flags.");
    }
    */

    // Hard-coded credential references (discouraged).
    private String getClassUsername() {
        return "admin";
    }

    private String getClassPassword() {
        return "supersecret123";
    }

    // Untested method => coverage impact
    public void untestedHelperMethod() {
        System.out.println("I'm never tested!");
    }

    // TODO: This is a TODO comment. Sonar often flags these if left behind.
}
