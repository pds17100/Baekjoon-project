package 일차원배열;

import java.util.Scanner;

public class 최댓값 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int arr[] = new int[9];
		int max= 0;
		int index = 0;
		
		for(int i=0; i<9; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
	
		for(int i =0; i<arr.length; i++) {	
			if(arr[i]>max) {
				max = arr[i];
				index = i+1;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
}
