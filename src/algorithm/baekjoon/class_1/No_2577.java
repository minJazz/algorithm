package algorithm.baekjoon.class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_2577 {
    public static void main(String[] args) throws IOException {
        int[] numCnt = new int[10];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.valueOf(bufferedReader.readLine());
        int b = Integer.valueOf(bufferedReader.readLine());
        int c = Integer.valueOf(bufferedReader.readLine());

        String total = "" + (a * b * c);
        
        for (int i = 0; i < total.length(); i++) {
            numCnt[Integer.valueOf(total.charAt(i) + "")]++;
        }
        for (int value : numCnt) {
            System.out.println(value);
        }
    }
}
