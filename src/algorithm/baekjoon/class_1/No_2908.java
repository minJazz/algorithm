package algorithm.baekjoon.class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = bufferedReader.readLine().split("[ ]");

        int[] values = new int[2];
        for (int i = 0; i < numbers.length; i++) {

            StringBuilder stringBuilder = new StringBuilder();
            for (int j = (numbers[i].length() - 1); j >= 0; j--) {
                stringBuilder.append(numbers[i].charAt(j));
            }

            values[i] = Integer.valueOf(stringBuilder.toString());
        }

        int max = values[0] > values[1] ? values[0] : values[1];
        
        System.out.println(max);
    }
}
