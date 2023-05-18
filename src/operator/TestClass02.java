package operator;

import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int num;
	
	System.out.println("수 입력: ");
	num = sc.nextInt();
	
	String s = (num%2==0)?"짝수":"홀수";
	System.out.println(num+" = "+s);
	// 입력한 수가 3의 배수인지 구분
	
	int num2;
	
	System.out.print("3의배수: ");
	num2 = sc.nextInt();
	
	s = (num2 % 3 == 0)? "3의배수":"3의 배수 아님";
	System.out.println(num2 + " = " + s);
	}
}

























