package algorithm.baekjoon.class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No_10818 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		reader.readLine();
		String[] values = reader.readLine().split(" ");
		
		int max = -100001;
		int min = 100001;
		System.out.println(Arrays.toString(values));
		for (int i = 0; i < values.length; i++) {
			int value = Integer.parseInt(values[i]);
			
			if (value < min) {
				min = value;
			}
			if (value > max) {
				max = value;
			}
		}
		
		System.out.println(min + " " + max);
	}
}
