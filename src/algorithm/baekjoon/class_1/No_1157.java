package algorithm.baekjoon.class_1;

import java.io.IOException;

public class No_1157 {
    public static void main(String[] args) throws IOException {

        int[] record = new int[26];

        int readChar = System.in.read();

        while (readChar > 64) { // 65 이하로 입력되는 경우 종료
            if (readChar < 91) { // 대문자까지 입력 받은 경우엔?
                record[readChar - 65]++;
            } else {
                record[readChar - 97]++;
            }
            readChar = System.in.read();
        }

        int max = -1; // 임의의 값.
        int ch = -2; // ?의 아스키 코드는 63이다. 
        // 위 반복문에서 이미 알파벳 별 가장 많이 나온 것은 정해짐.
        for (int i = 0; i < record.length; i++) {
            if (record[i] > max) {
                max = record[i];
                ch = i;
            } else if (record[i] == max) {
                ch = -2;
            }
        }
        
        //정답은 대문자로 출력하라 했으니 65를 더한 값을 출력하자. 
        System.out.print((char)(ch + 65));
    }
}
