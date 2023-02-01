package algorithm.baekjoon.class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferdReader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.valueOf(bufferdReader.readLine());

        for (int i = 0; i < count; i++) {
            String[] strings = bufferdReader.readLine().split("[ ]");

            int cnt = Integer.valueOf(strings[0]);
            String val = strings[1];
            
            for (int j = 0; j < val.length(); j++) {
                for (int z = 0; z < cnt; z++) {
                    System.out.print(val.charAt(j));
                }
            }
            System.out.println();
        }

    }
}
