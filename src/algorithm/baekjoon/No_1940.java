package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int length = Integer.parseInt(reader.readLine());
        int number = Integer.parseInt(reader.readLine());
        int[] array = new int[length];
        
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");
        
        for (int i = 0; i < length;  i++) {
            array[i] = Integer.parseInt(tokenizer.nextToken());
        }
        
        Arrays.sort(array);
        
        int i = 0;
        int j = length - 1;
        int count = 0;
        while (i < j) {
            if (array[i] + array[j] > number) {
                j--;
            } else if (array[i] + array[j] < number) {
                i++;
            } else {
                i++;
                j--;
                count++;
            }
        }
        System.out.println(count);
    }
}
