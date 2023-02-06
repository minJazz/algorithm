package algorithm.baekjoon.class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_2884 {
    public static void main(String[] args) throws IOException {
        /*
         * 1. 입력해준 문자열에서 공백을 기준으로 시 분을 나누어 45분을 뺸다.
         * 
         * 2. 케이스는 2가지이다. 분으로 45분을 뺀것이 0 이상인경우, 그 반대인 경우
         */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] times = bufferedReader.readLine().split("[ ]");

        bufferedReader.close();

        int hour = Integer.valueOf(times[0]);
        int minute = Integer.valueOf(times[1]);

        if (minute < 45) {
            hour--;
            if (hour < 0) {
                hour = 23;
            }

            minute = 60 - (45 - minute);
        } else {
            minute -= 45;
        }

        System.out.println(hour + " " + minute);
    }
}
