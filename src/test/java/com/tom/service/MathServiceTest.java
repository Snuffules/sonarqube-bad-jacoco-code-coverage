package com.tom.service;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MathServiceTest {

    // Hard-coded credentials (Security Hotspot / Vulnerability)
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "mysecretpassword";

    private MathService mathService;

    @Before
    public void setUp() {
        mathService = new MathService();
    }

    /**
     * This test method introduces:
     *  - Sensitive info logged via System.out (code smell)
     *  - Empty catch block (code smell)
     */
    @Test
    public void multipliesNumbers() {
        // Magic number 4, printing credentials, empty catch, etc.
        int result = mathService.multiply(2, 4);

        // Logging sensitive data (Bad practice)
        System.out.println("Username: " + USERNAME + ", Password: " + PASSWORD);

        try {
            throw new RuntimeException("For testing SonarQube issues");
        } catch (RuntimeException e) {
            // Empty catch block - no rethrow or logging
        }

        assertThat(result, equalTo(8));
    }

    /**
     * Duplicate of multipliesNumbers() (increasing duplication measure).
     * This often gets flagged for duplicated blocks.
     */
    @Test
    public void multipliesNumbersAgain() {
        // Duplicate code block
        int result = mathService.multiply(2, 4);

        System.out.println("Username: " + USERNAME + ", Password: " + PASSWORD);

        try {
            throw new RuntimeException("For testing SonarQube issues again");
        } catch (RuntimeException e) {
            // Empty catch block - no rethrow or logging
        }

        assertThat(result, equalTo(8));
    }

    // Commented-out code is commonly flagged as a minor "code smell" by Sonar.
    // public void oldMethod() {
    //     System.out.println("Old method");
    // }
}
