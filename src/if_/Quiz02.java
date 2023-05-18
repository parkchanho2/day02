package if_;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		/*
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
	*/
		String name;
		int kor, mat, eng, total;
		
		
		System.out.print("이름입력: ");
		name = sc.next();
		System.out.print("국어점수입력: ");
		kor = sc.nextInt();
		System.out.print("수합점수입력: ");
		mat = sc.nextInt();
		System.out.print("영어점수입력: ");
		eng = sc.nextInt();
		total = kor+mat+eng;
		double avg = total/3.0;
		
		System.out.println("이름: " + name + "\t 총합: " + total);
		System.out.printf("평균: %.2f", avg);
	}
}
