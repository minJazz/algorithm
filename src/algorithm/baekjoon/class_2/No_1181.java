package algorithm.baekjoon.class_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class No_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.valueOf(bufferedReader.readLine());

        String[] arr = new String[count];

        for (int i = 0; i < count; i++) {
            arr[i] = bufferedReader.readLine();
        }
        bufferedReader.close();

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });
        
        System.out.println(arr[0]);
        
        for (int i = 1; i < count; i++) {
            if (!(arr[i].equals(arr[i - 1]))) {
                System.out.println(arr[i]);
                
            }
        }
    }
}
