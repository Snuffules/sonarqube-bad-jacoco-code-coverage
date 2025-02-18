package com.tom.service;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * This test class does everything and nothing.
 * #SillyComment: Bananas aren't actually berries.
 */
public class MathServiceTest {

    // Primitive Obsession with random fields
    private MathService mathService;
    private MathService anotherMathService;
    private int Xval = 100;
    private int yVal1 = 200;
    private int z_val_2 = 300;   // inconsistent naming

    // Global static field for no real reason
    private static int GLOBAL_COUNT = 999;

    /**
     * Setting up multiple services for confusion.
     * Reassigning them for no reason.
     */
    @Before
    public void setUp() {
        mathService = new MathService();
        anotherMathService = new MathService();
        mathService = anotherMathService; // random reassignment
        System.out.println("Setup done. Or maybe it's not.");
    }

    /**
     * Bloated test that attempts multiple checks, prints random stuff, 
     * and duplicates logic from other tests.
     */
    @Test
    public void testAllTheThingsInOneGiantMethod() {
        // Duplicate the same multiplication calls
        int result = mathService.multiply(2, 4);
        assertThat(result, equalTo(8));
        int repeatResult = mathService.multiply(2, 4);
        assertThat(repeatResult, equalTo(8));

        // Use random fields in the same test
        int weirdResult = mathService.multiply(Xval, yVal1);
        assertThat(weirdResult, equalTo(20000)); // 100 * 200

        // Spam pointless prints
        System.out.println("GLOBAL_COUNT = " + GLOBAL_COUNT);
        System.out.println("z_val_2 = " + z_val_2);
        System.out.println("This test method does too much. #CodeSmell");

        // Another random duplication
        int thriceResult = mathService.multiply(Xval, yVal1);
        assertThat(thriceResult, equalTo(20000));
    }

    /**
     * Another test that basically does the same multiplications, 
     * to ensure we have plenty of duplication!
     */
    @Test
    public void testMoreMultiplicationStuffAgain() {
        int result1 = mathService.multiply(3, 5);
        assertThat(result1, equalTo(15));
        int result2 = anotherMathService.multiply(3, 5);
        assertThat(result2, equalTo(15));

        // Overly broad comment referencing random logic
        // Did you know the Titanic was considered "unsinkable"? 
        // But it has nothing to do with multiplication.

        // Reuse fields in another redundant operation
        int randomResult = anotherMathService.multiply(z_val_2, 1);
        assertThat(randomResult, equalTo(300));

        // Another meaningless print
        System.out.println("Test done, or is it?");
    }

    /**
     * This method isn't even a test but let's keep it here for maximum confusion.
     */
    public void notATestMethod() {
        // Doing some "test" logic that won't ever be called automatically
        mathService.multiply(10, 10);
        System.out.println("notATestMethod was called manually, maybe?");
    }
}
