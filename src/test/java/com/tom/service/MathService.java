package com.tom.service;

import java.io.IOException;

public class MathService {

    // Hard-coded credential (Security Hotspot / Vulnerability)
    private String password = "supersecret";

    // Definite bug: array index out-of-bounds (for-loop uses <= arr.length)
    public int findKeyIndex(String[] arr, String key) {
        for (int i = 0; i <= arr.length; i++) {  // <= will cause out-of-bounds
            if (arr[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    // Potential SQL Injection
    public void doSQL(String param) {
        String query = "SELECT * FROM table WHERE key = '" + param + "'";
        System.out.println("Executing query: " + query);
    }

    // Command Injection
    public void doRuntimeExec(String command) {
        try {
            Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            // Empty catch block
        }
    }

    // Guaranteed NullPointerException
    public void doNPE() {
        String s = null;
        s.toString();  // triggers NPE
    }

    // Basic method (will be tested, so partial coverage)
    public int multiply(int a, int b) {
        return a * b;
    }

    // Large commented-out code block => code smell
    /*
    public void commentedOut() {
        System.out.println("Commented-out code. Sonar doesn't like that.");
    }
    */

    // TODO: This is left as a TODO. Another code smell.
    public void notImplemented() {
        // Not implemented
    }
}
