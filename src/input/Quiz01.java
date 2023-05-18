package input;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int avg = 0;
		int kor= 0;
		int eng= 0;
		int mat= 0;
		String name;
		
		System.out.print("당신의 이름은 무엇입니까? ");
		name = sc.next();
		System.out.print(name + "님의 국어 점수: ");
		kor = sc.nextInt();
		System.out.print(name + "님의 영어 점수: ");
		eng = sc.nextInt();
		System.out.print(name + "님의 수학 점수: ");
		mat = sc.nextInt();
		
		avg = (kor+eng+mat)/3;
		
		System.out.println("=============================");
		System.out.println("이름: " + name);
		System.out.println("=============================");
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + mat);
		System.out.println("=============================");
		System.out.println("합계: " + (kor + eng + mat));
		System.out.println("평균: " + avg);
		System.out.println("=============================");
	}
}
