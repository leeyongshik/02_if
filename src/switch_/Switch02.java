package switch_;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.print("a의 값 : ");
		int a = scan.nextInt();
		System.out.print("b의 값 : ");
		int b = scan.nextInt();
		System.out.print("연산자(+,-,*,/)를 입력 : ");
		String c = scan.next();
		
		/* 값 안나옴 (내가 실패한 코딩)
		switch (c) {
		case "+" : result = a + b; break;
		case "-" : result = a - b; break;
		case "*" : result = a * b; break;
		case "/" : result = a / b; break;
		default : System.out.println("연산자 error");
		}
		*/
		
		switch (c) {
		case "+" : System.out.println(a+" + " + b + " = " + (a+b));; break;
		case "-" : System.out.println(a+" - " + b + " = " + (a-b));; break;
		case "*" : System.out.println(a+" * " + b + " = " + (a*b));; break;
		case "/" : System.out.println(a+" / " + b + " = " + ((double)(a)/b));; break;
		default : System.out.println("연산자 error");
		}
		
		
		

	}

}

/*
개의 정수형 숫자와 연산자(+,-,*,/)를 입력하여 계산하시오

[실행결과]
a의 값 : 25
b의 값 : 36
연산자(+,-,*,/)를 입력 : +

25 + 36 = xx

a의 값 : 25
b의 값 : 36
연산자(+,-,*,/)를 입력 : /

25 / 36 = 0.6944444444444444

a의 값 : 25
b의 값 : 36
연산자(+,-,*,/)를 입력 : #

연산자 error
*/