package 반복문;

import java.util.Scanner;

public class 사칙연산3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		for(int i=1; i<=T; i++) {
			int A = in.nextInt();
			int B = in.nextInt();
			System.out.println("Case #" + i + ": " + (A+B));
		}
	}
}
