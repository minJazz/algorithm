package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        //5 3
        int[] array = new int[Integer.parseInt(st.nextToken()) + 1];
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(reader.readLine(), " ");
        
        array[0] = 0;
        for (int i = 1; i < array.length; i++) {
            array[i] = (array[i - 1]) + Integer.parseInt(st.nextToken());
        }
        
        StringBuilder builder = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(reader.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            builder.append(array[y] - array[x - 1]).append('\n');
        }
        
        System.out.println(builder.toString());
    }
}
