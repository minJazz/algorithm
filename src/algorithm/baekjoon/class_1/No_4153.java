package algorithm.baekjoon.class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_4153 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		while(true) {
			StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
			int[] values = new int[3];
			
			values[0] = Integer.parseInt(st.nextToken());
			if (values[0] == 0) {
				break;
			}
			values[1] = Integer.parseInt(st.nextToken());
			values[2] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(values);
			
			boolean check = Math.pow(values[2], 2) == (Math.pow(values[0], 2) + Math.pow(values[1], 2));
			
			if (check) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
	}
}
