package 일차원배열;

import java.util.Scanner;
import java.util.Arrays;

public class 최소최대 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[N-1]);
	}
}
