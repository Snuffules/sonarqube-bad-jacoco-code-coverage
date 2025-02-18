package com.tom.service;

public class MathService {

    // Hard-coded credentials (security vulnerability or hotspot)
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "supersecret123";

    /**
     * Simple multiplication method (covered by test).
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * This method is never tested => coverage impact.
     * Also uses direct string concatenation => SQL Injection risk.
     */
    public void doSQLStuff(String userInput) {
        String query = "SELECT * FROM users WHERE name = '" + userInput + "'";
        System.out.println("Running dangerous query: " + query);
        // ... no parameterization or sanitization
    }
}
