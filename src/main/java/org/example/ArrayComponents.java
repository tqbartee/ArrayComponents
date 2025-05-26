package org.example;

public class ArrayComponents {

    public static int smallestValue(int[] inputArray) {
        // Write code to loop through the input array and get the
        // smallest value, and return the smallest value
        // Use inputArray.length for the loop iterations
        int smallest = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < smallest) {
                smallest = inputArray[i];
            }
        }
        return smallest;
    }

    public static int sumValue(int[] inputArray) {
        // Write code to loop through the input array and
        // compute the sum of the array values, and return the sum
        // Use inputArray.length for the loop iterations
        int total = 0;
        for (int i = 0; i < inputArray.length; i++) {
            total = total + inputArray[i];
        }
        return total;
    }

    public static void main(String[] args) {
        int[] ourArray = {5, 1, 2, 4, 3};
        int smallest = smallestValue(ourArray);
        System.out.println("Smallest is: " + smallest);
        int sum = sumValue(ourArray);
        System.out.println("Sum is: " + sum);
    }
}