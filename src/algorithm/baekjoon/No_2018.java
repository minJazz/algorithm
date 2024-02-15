package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
        int startIdx = 1;
        int endIdx = 1;
        int sum = 1;
        int count = 1;
        int N = Integer.parseInt(reader.readLine());
        
        while(endIdx != N) {
            if (sum < N) {
                sum += endIdx;
                endIdx ++;
            } else if (sum > N) {
                sum += startIdx;
                endIdx ++;
            } else if (sum == N) {
                sum += endIdx;
                endIdx++;
                count++;
            }
        }
        
        System.out.println(count);
    }
}
