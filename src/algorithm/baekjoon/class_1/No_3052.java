package algorithm.baekjoon.class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_3052 {
	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
//		int count = 0;
//		int[] array = new int[10];
//		for (int i = 0; i < array.length; i++) {
//			array[i] = sc.nextInt() % 42;
//		}
//		
//		boolean check = false;
//		for (int i = 0; i < array.length; i++) {
//			check = false;
//			for (int j = i + 1; j < array.length; j++ ) {
//				if (array[i] == array[j]) {
//					check = true;
//					break;
//				}
//				
//			}
//			if (!check) {
//				count++;
//			}
//		}
//		
//		sc.close();
//		System.out.println(count);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[10];
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.valueOf(reader.readLine());
		}
		
		boolean check = false;
		for (int i = 0; i < array.length; i++) {
			check = false;
			
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					check = true;
					break;
				}
			}
			if (!check) {
				count++;
			}
		}
	}
}
