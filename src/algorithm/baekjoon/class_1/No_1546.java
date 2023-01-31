package algorithm.baekjoon.class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_1546 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        double[] arr = new double[Integer.valueOf(br.readLine())];

//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = Double.valueOf(st.nextToken());
//        }
//
//        double sum = 0.0;
//        double avg = 0.0;
//        double max = -1;
//        for (double value : arr) {
//            if (max < value) {
//                max = value;
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (arr[i] / max) * 100;
//            sum += arr[i];
//        }
//
//        avg = sum / arr.length;
//        System.out.println(avg);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.valueOf(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double sum = 0.0;

        int max = -1;
        int value = -1;
        
        for (int i = 0; i < cnt; i++) {
            value = Integer.valueOf(st.nextToken());

            if (max < value) {
                max = value;
            }

            sum += value;
        }

        System.out.println(((sum / max) * 100) / cnt);
    }
}
