package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_11660 {
    public static void main(String[] args) throws IOException {
        
        // 2차원 배열 크기, 테스트 횟수 입력받기
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));    
        
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");
        // // 입력받은 배열 크기만큼 for문 2개로 초기화 진행 
        int length = Integer.parseInt(tokenizer.nextToken());
        int[][] array = new int[length + 1][length + 1];
        
        int count = Integer.parseInt(tokenizer.nextToken());
//        array[0][0] = 0;
        
        for (int i = 1; i < array.length; i++) {
            // 1 행 씩 나눠주기 위한 for
            tokenizer = new StringTokenizer(reader.readLine(), " ");
            for (int j = 1; j < array.length; j++) {
                //실질적으로 행에 값을 넣는 for
                array[i][j] = array[i][j - 1] + array[i - 1][j] - array[i - 1][j - 1] + Integer.parseInt(tokenizer.nextToken());
            }
        }
        
        int value = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            tokenizer = new StringTokenizer(reader.readLine(), " ");
            int a = Integer.parseInt(tokenizer.nextToken());
            int b = Integer.parseInt(tokenizer.nextToken());
            int c = Integer.parseInt(tokenizer.nextToken());
            int d = Integer.parseInt(tokenizer.nextToken());
            
            value = array[c][d] + array[a - 1][b - 1] - array[c][b - 1] - array[a - 1][d];
            sb.append(value).append('\n');
        }
        
        System.out.println(sb.toString());
    }
}
