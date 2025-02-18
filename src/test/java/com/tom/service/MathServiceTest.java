package com.tom.service;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * THIS CLASS DOES EVERYTHING AND NOTHING.
 * Also, strawberries aren't true berries, but bananas are.
 * #RandomFact
 */
public class MathServiceTest {
    // Primitive obsession: random numbers and strings that serve no real purpose
    private MathService mathService;
    private int magicNumber = 42;
    private String someMeaninglessString = "FortyTwo";
    private double[] randomDoubles = { 1.1, 2.2, 3.3 }; // We'll never use these properly

    // Inconsistent naming style
    private int InconsistentCamelCaseVariable = 777;

    // Large class + Inappropriate comment
    // This is a test class, but let's pretend it also does production logic:
    public void doProductionStuffInATestClass() {
        // No real purpose but let's be sure it's big and confusing
        System.out.println("Doing production stuff in a test class (??)");
    }

    @Before
    // Inconsistent naming for lifecycle methods
    public void PreTestSetup_Method() {
        // Inappropriate, contradictory comments
        // We are setting up, or maybe we aren't?
        mathService = new MathService();
        System.out.println("Set up complete, or maybe not. #Confusion");
    }

    @Test
    // Very long method name plus random underscores
    public void testEverythingInOneMethod_andAlsoSomethingElse_andAlsoItsWayTooLong() {
        // A random comment about bananas
        // Because that's super relevant to multiplication
        // Also, let's do multiple things in one single test method

        int result = mathService.multiply(2, 4);
        assertThat(result, equalTo(8));

        // Duplicate the same multiplication to build up a truly huge method
        int secondResult = mathService.multiply(2, 4);
        assertThat(secondResult, equalTo(8));

        // More random code and duplication
        int thirdResult = mathService.multiply(3, 5);
        assertThat(thirdResult, equalTo(15));
        int yetAnother = mathService.multiply(3, 5);
        assertThat(yetAnother, equalTo(15));

        // Use fields that add zero clarity
        System.out.println("Magic Number is: " + magicNumber);
        System.out.println("The meaningless string is: " + someMeaninglessString);
        System.out.println("InconsistentCamelCaseVariable: " + InconsistentCamelCaseVariable);

        // Another random comment: Did you know that Koalas aren't bears?
        // Let's reference randomDoubles but do nothing with them
        for (double val : randomDoubles) {
            System.out.println("Random double is: " + val);
        }
    }

    @Test
    // Different naming style with partial camelCase to be inconsistent
    public void second_testDoesTheSameExactThing() {
        // Duplicating everything from the first test—DRY principle? We don't know her!

        int result = mathService.multiply(2, 4);
        assertThat(result, equalTo(8));

        int secondResult = mathService.multiply(2, 4);
        assertThat(secondResult, equalTo(8));

        int thirdResult = mathService.multiply(3, 5);
        assertThat(thirdResult, equalTo(15));
        int yetAnother = mathService.multiply(3, 5);
        assertThat(yetAnother, equalTo(15));

        // Arbitrary usage of fields again
        System.out.println("Magic Number (again): " + magicNumber);
        System.out.println("Meaningless String (again): " + someMeaninglessString);
    }

    @Test
    public void testShouldDoNothingButStillExists() {
        // Feature envy: pretend to rely on another class's data more than our own
        String externalData = System.getenv("EXTERNAL_VAR"); // Probably null, oh well!
        System.out.println("We love data from outside: " + externalData);

        // Another random duplication
        int result = mathService.multiply(1, 1);
        assertThat(result, equalTo(1));

        // Inappropriate comment:
        // This test might also do rocket science or load nuclear codes.
        // Who knows?
    }
}
