package swapping_an_array_values;

import java.util.Arrays;

public class SwappingAnArrayValues{
    public static void swapFirstAndLastElements(int[] nums) { // nums is an array
        if (nums.length < 1) {
            return; // it returns nothing, i.e. just exits the method
        }

        // in this step the temp variable is used to hold the last element of the array in our case 5
        int temp = nums[nums.length - 1]; // save the last element in a temporary local variable
        //temp = 5
        // in this step the last element of the array is replaced with the first element of the array in our case 1
        nums[nums.length - 1] = nums[0];  // now, the last element becomes the first
        //nums[4] = 1
        // in this step the first element of the array is replaced with the last element of the array in our case 5
        nums[0] = temp; // now, the first element becomes the former last
    }

    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5 }; // numbers

        System.out.println(Arrays.toString(numbers)); // before swapping

        swapFirstAndLastElements(numbers); // swapping

        System.out.println(Arrays.toString(numbers)); // after swapping
        // the output will be [5, 2, 3, 4, 1]
    }

}