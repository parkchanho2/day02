package operator;


public class TestClass01 {
	public static void main(String[] args) {
		/*
		/ : 정수 / 정수 = 정수
		/ : 정수 / 실수 = 실수(연산 중 하나라도 실수가 있다면 결과는 실수)
		%(mod) : 정수 % 정수 = 나머지 값
		어떤수가 짝수,홀수,배수
		*/
		
		int n1 = 9, n2 = 2;
		System.out.println(n1+n2);
		System.out.println(n1-n2);
		System.out.println(n1*n2);
		System.out.println(n1/n2);
		System.out.println(n1/(float)n2);
		System.out.println(n1%n2);
		 
		/*
		 복합대입연산자
		 n1 = 5;
		 n1 += 10;  
		 */
		System.out.println("==== 복합대입연산자 ====");
		n1 = n2 = 5;
		n1 += 1;
		System.out.println(n1);
		n1 -= 1;
		System.out.println(n1);
		
		n1 *= n2;
		System.out.println(n1);
		n1 /= n2;
		System.out.println(n1);
		n1 %= n2;
		System.out.println(n1);
		
		/*
		 관계 연산자
		 - 결과적으로 true 또는 false를 알려준다.
		 >, <, >=, <=, ==, =!
		 */
		
		System.out.println("==== 관계 연산자 ====");
		n1 = 10; n2 = 5;
		System.out.println(n1>n2); //t
		System.out.println(n1==n2);//f
		System.out.println(n1==10);//t
		System.out.println(n1!=n2);//t
		System.out.println(n1!=10);//f
		
		/*
		 논리 연산자
		 ||(or): 식 중 하나라도 true면 결과는 true 
		 &&(and): 모두가 참일때 결과는 참. (하나라도 거짓이면 거짓)
		 !(not): 
		 */
		System.out.println("==== 논리 연산자 ====");
		System.out.println();
		System.out.println("-- or 연산자 --");
		System.out.println(true || true);  //t
		System.out.println(true || false); //t
		System.out.println(false || false); //f
		System.out.println();
		System.out.println("-- and 연산자 --");
		System.out.println(true && true);  //t
		System.out.println(true && false); //f
		System.out.println(false && false); //f
	
		
		// 이항연산자
		System.out.println(10 > 5 && 10 > 2); // 10> 5 > 2
		System.out.println();
		System.out.println("-- not 연산자 --");
		System.out.println(!true);
		System.out.println(!(10<5));
		System.out.println();
		/*
		 증감연산자 
		 - 결과적으로 자기자신을 1증가 or 감소
		  
		 */
		
		System.out.println("==== 증감 연산자 ====");
		n1 = 10;
		n2 = n1++;
		
		System.out.println(n1);
		System.out.println(n2);
		
		
		n1 = 10;
		n2 = ++n1; 
		System.out.println(n1);
		System.out.println(n2);
	}
}




















