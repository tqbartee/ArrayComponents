package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.ArrayComponents.*;

class ArrayComponentsTest {

    @Test
    void smallestValueTest() {
        int[] ourArray = {5, 1, 2, 4, 3};
        int smallest = smallestValue(ourArray);
        Assertions.assertEquals(1, smallest);
    }

    @Test
    void sumValueTest() {
        int[] ourArray = {5, 1, 2, 4, 3};
        int sum = sumValue(ourArray);
        Assertions.assertEquals(15, sum);
    }

}