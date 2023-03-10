package algorithm.baekjoon.class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_2562 {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        
//        int[] numbers = new int[9];
//        int max = 0;
//        int index = 0;
//        
//        for (int i = 0; i < numbers.length; i++) { 
//            int inputNumber = scanner.nextInt();
//            numbers[i] = inputNumber;
//        }
//        
//        for (int i = 0; i < numbers.length; i++) {
//            if (max < numbers[i]) {
//                max = numbers[i];
//                index = i + 1;
//            }
//        }
//        
//        System.out.println(max);
//        System.out.println(index);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[9];
        int max = 0;
        int index = 0;
        int count = 0;

        for (int i = 0; i < 9; i++) {
            int value = Integer.valueOf(br.readLine());
            numbers[i] = value;
        }
        for (int value : numbers) {
            count++;
            if (max < value) {
                max = value;
                index = count;
            }
        }

        System.out.println(max);
        System.out.println(index);

    }
}
