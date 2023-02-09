package algorithm.baekjoon.class_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String value = bufferedReader.readLine();
            boolean check = true;
            if ("0".equals(value)) {
                break;
            }

            for (int i = 0; i < value.length() / 2; i++) {
                if (value.charAt(i) != value.charAt(value.length() - 1 - i)) {
                    check = false;
                }
            }

            if (check) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
