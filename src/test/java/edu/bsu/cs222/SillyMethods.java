package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SillyMethods {
    @Test
    public void testDidGuess42Correctly(){
        SillyMethods sillyMethods = new SillyMethods();
        boolean result = sillyMethods.testDidGuess42(42);
        Assertions.assertTrue(result);
    }
    private boolean testDidGuess42(int i) {
        return true;
    }

    @Test
    public void testDidGuess42Incorrectly(){
        SillyMethods sillyMethods = new SillyMethods();
        boolean result = sillyMethods.testDidGuess42(17);
        Assertions.assertFalse(result);
    }

    @Test
    public void testCountTo(){
        SillyMethods sillyMethods = new SillyMethods();
        boolean result = sillyMethods.testCountTo(10);
        Assertions.assertEquals(result, "0 1 2 3 4 5 6 7 8 9 10");
    }

    private boolean testCountTo(int i) {
        return true;
    }

    @Test
    public void testCountTo15(){
        SillyMethods sillyMethods = new SillyMethods();
        String result = String.valueOf(sillyMethods.testCountTo15(15));
        Assertions.assertEquals(result, "0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15");
    }

    private boolean testCountTo15(int i) {
        return true;
    }

}

