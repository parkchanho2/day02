package if_;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// 점수를 입력 받고 80점 이상이면 합격 80점이하면 불합격 으로 나오게 만드세요.
		/*
		Scanner sc = new Scanner(System.in);
		int score = 0;
		
		System.out.print("점수 입력: ");
		score = sc.nextInt();
		if(score >= 80) {
			System.out.println("합격입니다");
		}	
		if (score <= 79 ) {
			System.out.println("불합격입니다");
		}
		*/
		
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
			
