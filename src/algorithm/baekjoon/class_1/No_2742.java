package algorithm.baekjoon.class_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No_2742 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int number = Integer.parseInt(bufferedReader.readLine().trim());
        
        StringBuilder stringBuilder = new StringBuilder();

        while (number > 0) {
            stringBuilder.append(number+"\n");
            number--;
        }
        System.out.println(stringBuilder);
        bufferedReader.close();
    }
}
