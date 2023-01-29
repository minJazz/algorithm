package algorithm.baekjoon.class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_1152 {
    public static void main(String[] args) throws IOException {

//        바이트 스트림 (가장빠른 방법)
//        int count = 0;
//        int pre_str = 32;
//        int str;
//
//
//        while (true) {
//            str = System.in.read();
//
//            if (str == 32) {
//                if (pre_str != 32) {
//                    count++;
//                }
//                
//            } else if (str == 10) {
//                if (pre_str != 32) {
//                    count++;
//                    break;
//                }
//            }
//
//            pre_str = str;
//        }
//        System.out.println(count);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        
        System.out.println(stringTokenizer.countTokens());
        
        
    }
}
