package if_;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a의 값 : ");
		int a = scan.nextInt();
		System.out.print("b의 값 : ");
		int b = scan.nextInt();
		System.out.print("c의 값 : ");
		int c = scan.nextInt();
		
		if( a > b && a > c )
			if( b > c ) System.out.println( a + " " + b + " " + c);
			else System.out.println( a + " " + c + " " + b);
		
		if( b > a && b > c)
			if( a > c)  System.out.println( b + " " + a + " " + c);
			else System.out.println( b + " " + c + " " + a);
		
		if( c > a && c > b)
			if( a > b) System.out.println(c + " " + a + " " + b) ;
			else System.out.println( c + " " + b + " " + a);
		
	}

}

/*

*/