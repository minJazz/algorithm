package algorithm.baekjoon.class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_2920 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] array = reader.readLine().split(" ");
		
		int[] newArray = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			newArray[i] = Integer.valueOf(array[i]);
		}
		
		String text = "";
		
		for (int i = 0; i < newArray.length; i++) {
			if (newArray[i + 1] == newArray[i] + 1) {
				text = "ascending";
			} else if (newArray[i + 1] == newArray[i] - 1) {
				text = "descending";
			} else {
				text = "mixed";
			}
		}
		System.out.println(text);
	}
}
