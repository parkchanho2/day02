package if_;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3,max;
	
		System.out.print("첫번째수: ");
		num1 = sc.nextInt();
		System.out.print("두번째수: ");
		num2 = sc.nextInt();
		System.out.print("세번째수: ");
		num3 = sc.nextInt();
		max = num1;
	
		if( num2 > max) {
			max = num3;
		}
	
		if( num3 > max) {
			max = num3;
		}
		System.out.println("가장 큰 수는" + max + "입니다.");
	}
}
