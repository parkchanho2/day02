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
		int num = 0;
		
		System.out.print("수 입력: ");
		num = sc.nextInt();
		
		if (num > 0 && num%2 == 0 ) System.out.println("양수, 짝수");
		if (num > 0 && num%2 != 0 ) System.out.println("양수, 홀수");
		if (num < 0) System.out.println("음수");
		if (num == 0) System.out.println("0");
		
		
	}
}
			
