package com.corndel.photoship;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sandbox {

    public static void main(String[] args) {
        String value = "5" + 55;

        System.out.println(value);

        String result = String.format("And the result is %s", value);

        System.out.println(result);

        // 2 WAYS TO DEFINE AN ARRAY

        int[] numbers = {1, 2, 3};

        int[] favouriteNumbers = new int[3];

        System.out.println(favouriteNumbers.length);

        System.out.println(Arrays.toString(favouriteNumbers));

        favouriteNumbers[0] = 1;

        List<Integer> myNumbers = new ArrayList<>(List.of(1, 2, 3));

        myNumbers.set(0, 2);
        System.out.println(myNumbers.get(myNumbers.size() - 1));

    }

    public static String hello() {
        return "Hello";
    }
}
