package javabasic;

import java.util.Scanner;

public class oddoreven {
	public static void main(String[]args) {	
		Scanner obj =new Scanner(System.in);
		System.out.println("enter the number: " );
		int num = obj.nextInt();
		if(num%2==0) {
			System.out.println("the number in even: " );
		}else {
			System.out.println("the number is odd: ");
		}
		obj.close()	}

}
