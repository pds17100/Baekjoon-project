package 연습하기;

import java.util.Scanner;

public class 나머지 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		in.close();
		
		System.out.println((A+B)%C);
		System.out.println((A%C)+(B%C)%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
	}

}
