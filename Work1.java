package com.company;

import java.util.Scanner;

public class Work1 {
    void start(){
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.next();
        int sum = 0;
        for (int i = 0; i < numbers.length(); i++)
            if (Character.getNumericValue(numbers.charAt(i)) < 10)
                sum += Character.getNumericValue(numbers.charAt(i));
        System.out.println(sum);
    }
}
