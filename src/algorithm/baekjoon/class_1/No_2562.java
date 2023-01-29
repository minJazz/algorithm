package algorithm.baekjoon.class_1;

import java.util.Scanner;

public class No_2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[9];
        int max = 0;
        int index = 0;
        
        for (int i = 0; i < numbers.length; i++) { 
            int inputNumber = scanner.nextInt();
            numbers[i] = inputNumber;
        }
        
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
                index = i + 1;
            }
        }
        
        System.out.println(max);
        System.out.println(index);
    }
}
