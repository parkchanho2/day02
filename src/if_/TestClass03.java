package if_;

import java.util.Scanner;

public class TestClass03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int num;
	System.out.print("수 입력: ");
	num = sc.nextInt();
	if (num % 2 == 0) {
		System.out.println(num + " = 짝수");
	}
	if(num % 2 != 0) {
		System.out.println(num + " = 홀수");
	}
	
	System.out.println("다음 문장들 실행");
	}
}
